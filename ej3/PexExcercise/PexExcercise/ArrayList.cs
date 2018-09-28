using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Diagnostics.Contracts;
using System.Collections;

namespace ArrayListProject
{
    public class ArrayList
    {
        private static int maxSize = 10;
        private Object[] items;
        private int last = -1;

        public ArrayList()
        {
            items = new Object[maxSize];
            last = -1;
        }

        public ArrayList(ICollection newItems)
        {
            if (items == null)
                items = new Object[maxSize];

            IEnumerator e = newItems.GetEnumerator();
            int i = 0;
            while ((e.MoveNext()) && (i < maxSize))
            {
                if (e.Current != null)
                    items[i] = e.Current;
                i++;
            }
            this.last = i - 1;
        }

        [Pure]
        public int getLast()
        {
            return last;
        }

        [Pure]
        public int getMaxSize()
        {
            return maxSize;
        }

        [Pure]
        public Object getElement(int index)
        {
            Contract.Requires(index >= 0 && index < this.getMaxSize());
            return items[index];
        }

        public void add(Object item, int position)
        {
            Contract.Requires(position >= 0 && position <= this.getLast()+1);
            Contract.Requires(item != null);
            Contract.Ensures(item == items[position]);
            Contract.Ensures(Contract.OldValue<int>(this.getLast()) < this.getLast());
            Contract.Ensures(Contract.ForAll(0, position, i => Contract.OldValue<Object>(this.getElement(i)).Equals( (Object) this.getElement(i)))  );
            //Contract.Ensures(Contract.ForAll(position, Contract.OldValue<int>(this.getLast()), i => Contract.OldValue<Object>(this.getElement(i)) == this.getElement(i + 1)));


            if (last + 1 == maxSize)
                throw new InsufficientMemoryException();

            int aux = last;
            while (aux >= position)
            {
                items[aux + 1] = items[aux];
                aux--;
            }
            items[position] = item;
            last++;
        }

        public void remove(int position)
        {
            //Contract.Requires(0 <= this.getLast());
            Contract.Requires(0 <= position && position <= this.getLast());
            Contract.Ensures(Contract.OldValue<int>(this.getLast()) > this.getLast());
            Contract.Ensures(Contract.ForAll(0, position , i => Contract.OldValue<Object>(this.getElement(i)).Equals(this.getElement(i))));
            int aux = position;
            while (aux < last)
            {
                items[aux] = items[aux + 1];
                aux++;
            }
            last--;
        }
    }
}
