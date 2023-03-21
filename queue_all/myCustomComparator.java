package org.example;

import java.util.Comparator;

public class myCustomComparator implements Comparator<studentMarks> {
    @Override
    public int compare(studentMarks o1, studentMarks o2) {

        //o1.getMaths()-o2.getMaths()  - for Low priority queue
        //o2.getMaths()-o1.getMaths() - for High priority queue
        if(o1.getMaths() != o2.getMaths())
            return o2.getMaths()-o1.getMaths();
        else
            return o2.getPhysics()-o1.getPhysics();
    }

}
