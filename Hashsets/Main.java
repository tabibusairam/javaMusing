package org.example;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

//      List<Integer> alist = new ArrayList<>(List.of(1,2,3,4,5));
//
//      Set<Integer> hashset = new HashSet<>(alist);
//
//      List<Integer> alist1 = new ArrayList<>(List.of(4,5,6,7,8));
//
//      Set<Integer> hashset1 = new HashSet<>(alist1);
//
//      System.out.println(hashset);
//      System.out.println(hashset1);

//      System.out.println("UNION");
//      hashset.addAll(hashset1);
//      System.out.println(hashset);
//      System.out.println(hashset1);

//      System.out.println(hashset.contains(100));
//      System.out.println(hashset.remove(1));
//      System.out.println(hashset);

////    To remove all elements
//      hashset.clear();

//      System.out.println("Remove Intersection");
//      hashset.removeAll(hashset1);
//      System.out.println(hashset);
//      System.out.println(hashset1);

//      System.out.println("Intersection");
//      hashset.retainAll(hashset1);
//      System.out.println(hashset);
//      System.out.println(hashset1);

        List<studentMarks> marks = new ArrayList<>();
        marks.add(new studentMarks(1,5));
        marks.add(new studentMarks(1,9));
        marks.add(new studentMarks(3,1));
        marks.add(new studentMarks(10,0));

        Set<studentMarks> linkedStudent = new LinkedHashSet<>(marks);

        System.out.println(linkedStudent);
        System.out.println(linkedStudent.contains(new studentMarks(1,5)));
    }
}