package org.example;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        genericInterface<Integer> obj = new genericInterface<>();
        obj.addItem(1);
        obj.addItem(2);
        obj.addItem(3);
        obj.addItem(4);

        obj.addItemNew(5);
        obj.addItemNew(6);
        obj.addItemNew(7);
        obj.addItemNew(8);
//        Iterator<Integer> iterator = obj.newIterator();
//
//        while(iterator.hasNext())
//        {
//            System.out.println(iterator.next());
//        }
        // Complies converts the first iterator so that it can be used as below and
        // it is equivalent to the iterator code implemented above.
        for(int x:obj)
            System.out.println(x);

    }
}