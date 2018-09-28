/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package cachelist;


import java.io.Serializable;
import java.util.HashSet;

/**
 * A <code>List</code> implementation that stores a cache of internal Node objects
 * in an effort to reduce wasteful object creation.
 * <p>
 * A linked list creates one Node for each item of data added. This can result in
 * a lot of object creation and garbage collection. This implementation seeks to
 * avoid that by maintaining a store of cached nodes.
 * <p>
 * This implementation is suitable for long-lived lists where both add and remove
 * are used. Short-lived lists, or lists which only grow will have worse performance
 * using this class.
 * <p>
 * <b>Note that this implementation is not synchronized.</b>
 * 
 * @since Commons Collections 3.0
 * @version $Revision: 1.1 $ $Date: 2010/05/10 18:19:40 $
 * 
 * @author Jeff Varszegi
 * @author Rich Dougherty
 * @author Phil Steitz
 * @author Stephen Colebourne
 */

import korat.finitization.IFinitization;
import korat.finitization.IIntSet;
import korat.finitization.IObjSet;
import korat.finitization.impl.FinitizationFactory;

public class NodeCachingLinkedList implements Serializable {
	
	private  static final long serialVersionUID = 1; 
	
//	serialVersionUID 
	
	private  LinkedListNode header;
	private  int size;
	private  int modCount;

	/**
	 * The default value for {@link #maximumCacheSize}.
	 */
	protected /*static*/ final int DEFAULT_MAXIMUM_CACHE_SIZE = 20;

	/**
	 * The first cached node, or <code>null</code> if no nodes are cached.
	 * Cached nodes are stored in a singly-linked list with
	 * <code>next</code> pointing to the next element.
	 */
	protected /*@ nullable @*/ LinkedListNode firstCachedNode;

	/**
	 * The size of the cache.
	 */
	protected  int cacheSize;

	/**
	 * The maximum size of the cache.
	 */
	protected int maximumCacheSize;

	//-----------------------------------------------------------------------
	protected LinkedListNode createHeaderNode() {
		return new LinkedListNode();
	}

	//-----------------------------------------------------------------------
	/**
	 * Constructor that creates.
	 */
	public NodeCachingLinkedList() {
		super();
		header = createHeaderNode();
		size = 0;
		cacheSize = 0;
		firstCachedNode = null;
		maximumCacheSize = DEFAULT_MAXIMUM_CACHE_SIZE;
	}

	//-----------------------------------------------------------------------
	/**
	 * Gets the maximum size of the cache.
	 * 
	 * @return the maximum cache size
	 */
	protected int getMaximumCacheSize() {
		return maximumCacheSize;
	}

	/**
	 * Sets the maximum size of the cache.
	 * 
	 * @param maximumCacheSize  the new maximum cache size
	 */
	protected void setMaximumCacheSize(int maximumCacheSize) {
		this.maximumCacheSize = maximumCacheSize;
		shrinkCacheToMaximumSize();
	}
	
	protected LinkedListNode getFirstCacheNode() {
		return this.firstCachedNode;
	}
	
	protected LinkedListNode getLast() {
		return this.getNode(this.size-1, false);
	}
	/**
	 * Reduce the size of the cache to the maximum, if necessary.
	 */
	protected void shrinkCacheToMaximumSize() {
		// Rich Dougherty: This could be more efficient.
		while (cacheSize > maximumCacheSize) {
			getNodeFromCache();
		}
	} 

	/**
	 * Gets a node from the cache. If a node is returned, then the value of
	 * {@link #cacheSize} is decreased accordingly. The node that is returned
	 * will have <code>null</code> values for next, previous and element.
	 *
	 * @return a node, or <code>null</code> if there are no nodes in the cache.
	 */
	protected LinkedListNode getNodeFromCache() {
		if (cacheSize == 0) {
			return null;
		}
		LinkedListNode cachedNode = firstCachedNode;
		firstCachedNode = cachedNode.next;
		cachedNode.next = null; // This should be changed anyway, but defensively
		// set it to null.                    
		cacheSize--;
		return cachedNode;
	}

	/**
	 * Checks whether the cache is full.
	 * 
	 * @return true if the cache is full
	 */
	protected boolean isCacheFull() {
		return cacheSize >= maximumCacheSize;
	}

	/**
	 * Adds a node to the cache, if the cache isn't full.
	 * The node's contents are cleared to so they can be garbage collected.
	 * 
	 * @param node  the node to add to the cache
	 */
	protected void addNodeToCache(LinkedListNode node) {
		if (isCacheFull()) {
			// don't cache the node.
			return;
		}
		// clear the node's contents and add it to the cache.
		LinkedListNode nextCachedNode = firstCachedNode;
		node.previous = null;
		node.next = nextCachedNode;
		node.setValue(null);
		firstCachedNode = node;
		cacheSize++;
	}

	//-----------------------------------------------------------------------    
	/**
	 * Creates a new node, either by reusing one from the cache or creating
	 * a new one.
	 * 
	 * @param value  value of the new node
	 * @return the newly created node
	 */
	protected LinkedListNode createNode(Object value) {
		LinkedListNode cachedNode = getNodeFromCache();
		if (cachedNode == null) {
			return super_createNode(value);
		} else {
			cachedNode.setValue(value);
			return cachedNode;
		}
	}

	/**
	 * Removes the specified node from the list.
	 *
	 * @param node  the node to remove
	 * @throws NullPointerException if <code>node</code> is null
	 */
	private void super_removeNode(LinkedListNode node) {
		node.previous.next = node.next;
		node.next.previous = node.previous;
		size--;
		modCount++;
	}

	/**
	 * Removes the node from the list, storing it in the cache for reuse
	 * if the cache is not yet full.
	 * 
	 * @param node  the node to remove
	 */
	protected void removeNode(LinkedListNode node) {
		super_removeNode(node);
		addNodeToCache(node);
	}

	/**
	 * Removes all the nodes from the list, storing as many as required in the
	 * cache for reuse.
	 * 
	 */
	protected void removeAllNodes() {
		// Add the removed nodes to the cache, then remove the rest.
		// We can add them to the cache before removing them, since
		// {@link AbstractLinkedList.removeAllNodes()} removes the
		// nodes by removing references directly from {@link #header}.
		int numberOfNodesToCache = Math_min(size, maximumCacheSize - cacheSize);
		LinkedListNode node = header.next;
		for (int currentIndex = 0; currentIndex < numberOfNodesToCache; currentIndex++) {
			LinkedListNode oldNode = node;
			node = node.next;
			addNodeToCache(oldNode);
		}
		super_removeAllNodes();
	}

	private int Math_min(int left, int right) {
		return left < right ? left : right;
	}

	//-----------------------------------------------------------------------    

	private LinkedListNode super_createNode(Object value) {
		return new LinkedListNode(value);
	}

	//-----------------------------------------------------------------------    

	private void super_removeAllNodes() {
		header.next = header;
		header.previous = header;
		size = 0;
		modCount++;
	}

	//-----------------------------------------------------------------------    

	public boolean remove(/*@ nullable @*/Object value) {
		for (LinkedListNode node = header.next; node != header; node = node.next) {
			if (isEqualValue(node.getValue(), value)) {
				removeNode(node);
				return true;
			}
		}
		return false;
	}

	//-----------------------------------------------------------------------    

	protected/*@ pure @*/boolean isEqualValue(Object value1, Object value2) {
		return (value1 == value2 || (value1 == null ? false : value1
				.equals(value2)));
	}

	//-----------------------------------------------------------------------    

	public boolean add(Object value) {
		return addLast(value);
	}

	//-----------------------------------------------------------------------    

	/**
	 * @Modifies_Everything
	 * 
	 * @Ensures return==true; 
	 */
	public boolean addLast(/*@ nullable @*/Object o) {
		addNodeBefore(header, o);
		return true;
	}

	//-----------------------------------------------------------------------    

	protected void addNodeBefore(LinkedListNode node, Object value) {
		LinkedListNode newNode = createNode(value);
		addNode(newNode, node);
	}

	//-----------------------------------------------------------------------    

	protected void addNode(LinkedListNode nodeToInsert,
			LinkedListNode insertBeforeNode) {
		nodeToInsert.next = insertBeforeNode;
		nodeToInsert.previous = insertBeforeNode.previous;
		insertBeforeNode.previous.next = nodeToInsert;
		insertBeforeNode.previous = nodeToInsert;
		size++;
		modCount++;
	}

	//-----------------------------------------------------------------------    

	/**
	 * @Modifies_Everything
	 * 
	 * @Ensures (some i: int | ( 0<=i && i<#(this.myseq) && this.myseq[i].value=arg ) )  
	 *          <=>  return==true ;
     *
	 */
	public boolean contains(/*@ nullable @*/Object arg) {
		return indexOf(arg) != -1;
	}

	//-----------------------------------------------------------------------    

	public/*@ pure @*/int indexOf(Object value) {
		int i = 0;
		for (LinkedListNode node = header.next; node != header; node = node.next) {
			if (isEqualValue(node.getValue(), value)) {
				return i;
			}
			i++;
		}
		return -1;
	}

	//-----------------------------------------------------------------------

	/**
	 * @NormalBehavior
	 *   @Requires index >=0 && index<this.size ;
	 *   @Modifies_Everything
	 *   @Ensures
  	 *		  ( #(this.myseq)=#(@old(this.myseq))-1 )  &&
	 *		  ( all i: int | ( 0<=i && i<#(this.myseq) ) => (
	 *				 (  i < index => this.myseq[i]=@old(this.myseq[i])   ) && 
	 *				 (  i>= index => this.myseq[i]=@old(this.myseq)[i+1] ) 
	 *				));
	 *
	 * @ExceptionalBehavior
	 *   @Requires index<0 || index>=this.size ;
	 *   @Ensures throw in IndexOutOfBoundsException ;
	 */
	public/*@ nullable @*/Object removeIndex(int index) {
		LinkedListNode node = getNode(index, false);
		Object oldValue = node.getValue();
		removeNode(node);
		return oldValue;
	}

	//-----------------------------------------------------------------------
	
	protected LinkedListNode getNode(int index, boolean endMarkerAllowed)
			throws RuntimeException {
		// Check the index is within the bounds
		if (index < 0) {
			throw new RuntimeException("Couldn't get the node: "
					+ "index (" + index + ") less than zero.");
		}
		if (!endMarkerAllowed && index == size) {
			throw new RuntimeException("Couldn't get the node: "
					+ "index (" + index + ") is the size of the list.");
		}
		if (index > size) {
			throw new IndexOutOfBoundsException("Couldn't get the node: "
					+ "index (" + index + ") greater than the size of the "
					+ "list (" + size + ").");
		}
		// Search the list and get the node
		LinkedListNode node;
		if (index < (size / 2)) {
			// Search forwards
			node = header.next;
			for (int currentIndex = 0; currentIndex < index; currentIndex++) {
				node = node.next;
			}
		} else {
			// Search backwards
			node = header;
			for (int currentIndex = size; currentIndex > index; currentIndex--) {
				node = node.previous;
			}
		}
		return node;
	}
	
	//-----------------------------------------------------------------------

	public boolean repOK() { 
		return loopList() && cacheOk();
	}
	
	//-----------------------------------------------------------------------
	
	public boolean cacheOk() {
		int i = 0;
		HashSet<LinkedListNode> visited = new HashSet<LinkedListNode>();
		for(LinkedListNode l = firstCachedNode; l != null ; l = l.next) {
			if (l.value != null || l.previous != null || !visited.add(l)) {
				return false;
			}
			i++;
		}
		return i == cacheSize && i <= maximumCacheSize;
	}
	
	//-----------------------------------------------------------------------
	
	public boolean loopList() {	
		//null checks
		if (this == null || header == null || header.value != null 
				|| header.next == null || header.previous  == null){
			return false;
		}
		// base case, check the ficticious elements
		if(header.next == header || header.previous == header) {
			return header.next == header && header.previous == header && header.next == header.previous && size == 0;
		}
		int i = 0;
		LinkedListNode second = header;
		HashSet<LinkedListNode> visited = new HashSet<LinkedListNode>();
		boolean loop = true;
		for(LinkedListNode l = header.next; l != header && loop  ; l = l.next) {
			if (l == null || l.next == null || l.previous == null || !visited.add(l)) {
				return false;
			}

			loop = loop && second.next == l && l.previous == second;
			second = l; 
			i++;
		}
		return i == size && loop && header.previous == second;
	}

	//-----------------------------------------------------------------------

	public static IFinitization finNodeCachingLinkedList(int maxNodes, int maxCache){
		
		// Tengo que generar NodeCachingLinkedList, un buen generador podría tomar, la cantidad de nodos 
		// máximos de una lista, La cantidad de nodos de la caché...... en otro generador podría poner los valores del campo value.
	
		IFinitization f = FinitizationFactory.create(NodeCachingLinkedList.class);
		
		// Include null value
		IObjSet entries = f.createObjSet(LinkedListNode.class, maxNodes , true);
		// Exclude null value 
//		IObjSet entries = f.createObjSet(LinkedListNode.class, maxNodes, false);
		
		IIntSet listSizes  = f.createIntSet(0,maxNodes); 
		IIntSet cacheSizes = f.createIntSet(0,maxCache); 
//		IObjSet values = f.createObjSet(Integer.class,3,true);
		
		f.set("header", entries);
		f.set("firstCachedNode", entries);
		f.set("size", listSizes);
		f.set("cacheSize", cacheSizes);
		// Should try with 0,1
		f.set("maximumCacheSize", f.createIntSet(0,1));

		f.set("LinkedListNode.previous", entries);
		f.set("LinkedListNode.next", entries);
//		f.set("LinkedListNode.value", values);
		
        return f;
	}	
	
	//-----------------------------------------------------------------------
}