package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> alist = new ArrayList<>(List.of(1,2,3,4,5));

        System.out.println(alist);

        alist.add(1);
        alist.add(2);
        alist.add(3);

        // Converts arraylist to array, here we can access element by index using []
        System.out.println("converted array list to array - " + alist.toArray(new Integer[0])[0]);

        List<Integer> alist1 = new ArrayList<>(alist);
        System.out.println(alist1);

        alist1.addAll(alist1);
        System.out.println(alist1);
        System.out.println(alist1.indexOf(1));
        System.out.println(alist1.lastIndexOf(1));

        List<Integer> alist2 = alist1.subList(1,4);
        alist2.set(0,100);
        System.out.println(alist2);
        System.out.println(alist1);

        System.out.println(alist1.get(0));

        List<Integer> lt = new LinkedList<>();
        lt.add(1);
        lt.add(2);
        lt.add(3);

        ListIterator<Integer> iterator = lt.listIterator();
        System.out.println(lt.indexOf(7));

        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.hasPrevious());
        System.out.println(iterator.previous());
        System.out.println(iterator.previousIndex());

    }
}