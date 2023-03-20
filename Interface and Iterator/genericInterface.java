package org.example;
import java.util.Iterator;
public class genericInterface<T> implements Iterable<T>{
    private T[] items;
    private T[] new_Items;
    private int size;
    private int new_size;

    public genericInterface()
    {
        size = 0;
        new_size=0;
        this.items = (T[]) new Object[100];
        this.new_Items = (T[]) new Object[100];
    }

    public void addItem(T data)
    {
        items[size++] = data;
    }

    public void addItemNew(T data)
    {
        new_Items[new_size++] = data;
    }
    public T getItemAtIndex(int index)
    {
        return items[index];
    }

    public Iterator<T> iterator()
    {
        return new genericInterfaceIterator(this);
    }

    public Iterator<T> newIterator()
    {
        return new newGenericInterfaceIterator(this);
    }
    private class genericInterfaceIterator implements Iterator<T>
    {
        private genericInterface<T> list;
        private int index = 0;

        public genericInterfaceIterator(genericInterface<T> list)
        {
            this.list = list;
        }
        @Override
        public boolean hasNext() {
            return index < list.size;
        }

        @Override
        public T next() {
            return list.items[index++];
        }

//        public boolean hasPrev() {
//            return index>=0;
//        }
//
//        public T prev(){
//            return list.items[index--];
//        }
    }

    private class newGenericInterfaceIterator implements Iterator<T>
    {
        private genericInterface<T> list;
        private int index = 0;

        public newGenericInterfaceIterator(genericInterface<T> list)
        {
            this.list = list;
        }
        @Override
        public boolean hasNext() {
            return index < list.size;
        }

        @Override
        public T next() {
            return list.new_Items[index++];
        }

//        public boolean hasPrev() {
//            return index>=0;
//        }
//
//        public T prev(){
//            return list.items[index--];
//        }
    }
}
