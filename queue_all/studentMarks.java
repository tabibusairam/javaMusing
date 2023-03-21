package org.example;

import java.util.Comparator;

public class studentMarks implements Comparable<studentMarks> {
    private int maths;
    private int physics;

    @Override
    public String toString() {
        return "studentMarks{" +
                "maths=" + maths +
                ", physics=" + physics +
                '}';
    }

    public int getMaths() {
        return maths;
    }

    public int getPhysics() {
        return physics;
    }

    public studentMarks(int maths, int physics) {
        this.maths = maths;
        this.physics = physics;
    }

    public int compareTo(studentMarks o)
    {
        /*
        current object < other object
            return -1;  // or any negative number
        current object > other object
            return 1;  // or any positive number
        current object = other object
            return 0;  // return 0
         */


        //low priority queue - this.maths-o.maths
        //high priority queue - o.maths - this.maths
        if(this.maths != o.maths)
            return -1*this.maths + o.maths;
        else
            return -1*this.physics + o.physics;
    }


}
