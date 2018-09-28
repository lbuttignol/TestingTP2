package cachelist;

import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.reflect.Field;

import org.junit.Test;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeThat;
import static org.junit.Assume.assumeTrue;

@RunWith(Theories.class)
public class NodeCachingLinkedListTheories {
	
	@Theory 
	public void addIncreaseSize(@NodeCachingLinkedListGen() NodeCachingLinkedList l) {
		Field access;
		int oldSize = -1, newSize = -1;
		boolean result = false; 
		try {
			access = l.getClass().getDeclaredField("size");
			access.setAccessible(true);
			oldSize = (Integer) access.get(l);
			Integer val = new Integer(10);
			result = l.add(val);
			newSize = (Integer) access.get(l);
		}catch (NoSuchFieldException e) {
			e.printStackTrace();
			fail("Reflection error, NoSuchFieldException");
		} catch (SecurityException e) {
			e.printStackTrace();
			fail("Reflection error, SecurityException");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			fail("Reflection error, IllegalArgumentException");
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			fail("Reflection error, IllegalAccessException");
		}
		
		assertTrue("The add crash the list ",l.repOK());
		assertTrue("add Do not increase size",oldSize < newSize);
		assertTrue("Failed add",result);
	}
	
	@Theory 
	public void removeDecreaseSize(@NodeCachingLinkedListGen() NodeCachingLinkedList l) {
		Field access;
		int oldSize = -1, newSize = -1;
		Integer objToInsert = new Integer(10);
		boolean result = false; 
		l.add(objToInsert);
		try {
			access = l.getClass().getDeclaredField("size");
			access.setAccessible(true);
			oldSize = (Integer) access.get(l);
			result = l.remove(objToInsert);
			newSize = (Integer) access.get(l);
		}catch (NoSuchFieldException e) {
			e.printStackTrace();
			fail("Reflection error, NoSuchFieldException");
		} catch (SecurityException e) {
			e.printStackTrace();
			fail("Reflection error, SecurityException");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			fail("Reflection error, IllegalArgumentException");
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			fail("Reflection error, IllegalAccessException");
		}
		
		assertTrue("The remove crash the list", l.repOK());
		assertTrue("Remove do not decrease size of this list", newSize < oldSize);
		assertTrue("Remove has failed",result);
		assertFalse("Remove has failed",!result);
	}
	
	@Theory
	public void addNodeToCache(@NodeCachingLinkedListGen() NodeCachingLinkedList l) {
		int oldCacheSize = -1, newCacheSize = -1;
		boolean result = false; 
		Integer objToInsert = new Integer(10);
		l.add(objToInsert);
		oldCacheSize = l.cacheSize;
		assumeTrue(oldCacheSize < l.maximumCacheSize);
		result = l.remove(objToInsert);
		newCacheSize = l.cacheSize;
		
		assertTrue("The remove crash the repOK ",l.repOK());
		assertTrue("The remove method do not add a node un the cache", newCacheSize > oldCacheSize);
		assertTrue("Remove has failed",result);
	}

	@Theory
	public void deleteNodeToCache(@NodeCachingLinkedListGen() NodeCachingLinkedList l) {
		assumeTrue(l.cacheSize > 0);
		int oldCacheSize = -1, newCacheSize = -1;
		boolean result = false; 
		Integer objToInsert = new Integer(10);
		oldCacheSize = l.cacheSize;
		LinkedListNode firstCN = l.getFirstCacheNode();
		try {	
			result = l.add(objToInsert);
		}catch(RuntimeException e) {
			e.printStackTrace();
			fail("RuntimeError , This is to kill mutants");
		}

		assertTrue("The add crash the repOK ",l.repOK());
		assertTrue("The add method do not add a node un the cache", newCacheSize < oldCacheSize);
		assertTrue("add has failed",result);
		assertTrue(firstCN.equals(l.getLast()));
	}
	
	@Theory
	public void deleteAnEmptyList(@NodeCachingLinkedListGen() NodeCachingLinkedList l) {
		Integer obj = new Integer(3);
		assumeFalse(l.contains(obj));
		boolean result = l.remove(obj);
		assertFalse("Result return true when should fail",result);
		
	}
	
//	---------------------------------------------------------------------------------------
//	Theories to kill some mutants
	
	@Theory
	public void isEqualValueTest(@NodeCachingLinkedListGen() NodeCachingLinkedList l) {
		String obj0 = new String("String to search");
		String obj1 = new String("Other String");
		assumeFalse(l.contains(obj0));
		boolean result = l.add(obj0);
		
		assertTrue("The add has failed",result);
		assertTrue("Cant find the object added",l.contains(obj0));
		Field access;
		try {
			access = l.getClass().getDeclaredField("size");
			access.setAccessible(true);
			int size = (Integer) access.get(l);
			String obj2 = (String) l.getNode(size-1,false).getValue();
			System.out.println(obj0);
			System.out.println(obj2);
			assertTrue(l.isEqualValue(obj2 ,obj0));
			assertFalse(l.isEqualValue(obj2 ,obj1));
		}catch (NoSuchFieldException e) {
			e.printStackTrace();
			fail("Reflection error, NoSuchFieldException");
		} catch (SecurityException e) {
			e.printStackTrace();
			fail("Reflection error, SecurityException");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			fail("Reflection error, IllegalArgumentException");
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			fail("Reflection error, IllegalAccessException");
		}
	}
	
	@Theory
	public void addIncreaseModCount(@NodeCachingLinkedListGen() NodeCachingLinkedList l) {
		Field access;
		try {
			access = l.getClass().getDeclaredField("modCount");
			access.setAccessible(true);
			int oldValue = (Integer) access.get(l);
			if(l.add((Integer) 5)){
				int newValue0= (Integer) access.get(l);;
				assertTrue(oldValue< newValue0);
			}else{
				fail("The add should increase modCount variable");
			}
		}catch (NoSuchFieldException e) {
			e.printStackTrace();
			fail("Reflection error, NoSuchFieldException");
		} catch (SecurityException e) {
			e.printStackTrace();
			fail("Reflection error, SecurityException");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			fail("Reflection error, IllegalArgumentException");
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			fail("Reflection error, IllegalAccessException");
		}
	}
	
	@Theory
	public void removeIncreaseModCount(@NodeCachingLinkedListGen() NodeCachingLinkedList l) {
		Field access;
		try {
			access = l.getClass().getDeclaredField("modCount");
			access.setAccessible(true);
			l.add((Integer) 5);
			int oldValue = (Integer) access.get(l);
			if(l.remove((Integer) 5)){
				int newValue0= (Integer) access.get(l);;
				assertTrue(oldValue<=newValue0);
			}else{
				fail("The add should increase modCount variable");
			}
		}catch (NoSuchFieldException e) {
			e.printStackTrace();
			fail("Reflection error, NoSuchFieldException");
		} catch (SecurityException e) {
			e.printStackTrace();
			fail("Reflection error, SecurityException");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			fail("Reflection error, IllegalArgumentException");
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			fail("Reflection error, IllegalAccessException");
		}
	}
	
	@Theory
	public void removeIndexIncreaseModCount(@NodeCachingLinkedListGen() NodeCachingLinkedList l) {
		Field access;
		try {
			access = l.getClass().getDeclaredField("modCount");
			access.setAccessible(true);
			l.add((Integer) 5);
			int oldValue = (Integer) access.get(l);
			l.removeIndex(0);
			int newValue0 = (Integer) access.get(l);;
			assertTrue(oldValue<=newValue0);
		}catch (NoSuchFieldException e) {
			e.printStackTrace();
			fail("Reflection error, NoSuchFieldException");
		} catch (SecurityException e) {
			e.printStackTrace();
			fail("Reflection error, SecurityException");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			fail("Reflection error, IllegalArgumentException");
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			fail("Reflection error, IllegalAccessException");
		}
	}
	
	@Theory
	public void removeAllNodesIncreaseModCount(@NodeCachingLinkedListGen() NodeCachingLinkedList l) {
		Field access;
		try {
			access = l.getClass().getDeclaredField("modCount");
			access.setAccessible(true);
			int oldValue = (Integer) access.get(l);
			l.removeAllNodes();
			int newValue0= (Integer) access.get(l);;
			assertTrue(oldValue<=newValue0);
		}catch (NoSuchFieldException e) {
			e.printStackTrace();
			fail("Reflection error, NoSuchFieldException");
		} catch (SecurityException e) {
			e.printStackTrace();
			fail("Reflection error, SecurityException");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			fail("Reflection error, IllegalArgumentException");
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			fail("Reflection error, IllegalAccessException");
		}
	}
	
	@Theory
	public void gnfcMutant(@NodeCachingLinkedListGen() NodeCachingLinkedList l) {
		l.maximumCacheSize = 0;
		l.add(new Integer(6));
	}
	
	@Test
	public void mutantLine147 () {
		NodeCachingLinkedList l = new NodeCachingLinkedList();
		l.add(5);
	}
}
