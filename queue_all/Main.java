package org.example;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("_________All about queue_________");
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.offer(4);

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println("size after peek - " + queue.size());
        System.out.println(queue.remove());
        System.out.println("size after remove - " + queue.size());
        System.out.println(queue.poll());
        System.out.println("size after poll - " + queue.size());
        System.out.println(queue);

        System.out.println("_________All about stack_________");

        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.push(2);
        stack.add(3);

        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack);

        System.out.println("_________All about Deque_________");
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(1);
        deque.offer(2);
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        deque.offerFirst(3);
        deque.offerLast(4);

        System.out.println(deque.size());
        System.out.println(deque.isEmpty());
        System.out.println(deque);


        System.out.println("_________All about Priority Queue_________");

        //Low Priority queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(1);
        priorityQueue.offer(3);
        priorityQueue.add(2);
        priorityQueue.add(9);
        priorityQueue.add(7);
        System.out.println(priorityQueue);

        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);

        //High Priority queue
        PriorityQueue<studentMarks> marks = new PriorityQueue<>();
        marks.add(new studentMarks(1, 2));
        marks.add(new studentMarks(4, 6));
        marks.add(new studentMarks(1, 9));
        marks.add(new studentMarks(10, 4));

        //OR

//        List<studentMarks> sq = new ArrayList<studentMarks>();
//        sq.add(new studentMarks(1,2));
//        sq.add(new studentMarks(4,6));
//        sq.add(new studentMarks(1,9));
//        sq.add(new studentMarks(10,4));
//        PriorityQueue<studentMarks> marks = new PriorityQueue<>(sq);

        while (!marks.isEmpty()) {
            System.out.println(marks.peek().getMaths() + " " + marks.peek().getPhysics());
            marks.poll();
        }


        // Yet another priority queue - implements comparator
        System.out.println(" Comparator Story");
        PriorityQueue<studentMarks> newMarks = new PriorityQueue<>(new myCustomComparator());
        // Another way of writing this -
        // PriorityQueue<studentMarks> newMarks = new PriorityQueue<>((a,b) ->
        //{
        //  if(o1.getMaths() != o2.getMaths())
        //      return o2.getMaths()-o1.getMaths();
        //  else
        //      return o2.getPhysics()-o1.getPhysics();
        // }
        // The ordering created by Comparable in studentMarks - Natural ordering
        // new ordering created by comparator - total ordering.
        newMarks.add(new studentMarks(1,2));
        newMarks.add(new studentMarks(4,6));
        newMarks.add(new studentMarks(1,9));
        newMarks.add(new studentMarks(10,4));
        while(!newMarks.isEmpty())
        {
            System.out.println(newMarks.peek().getMaths() + " " + newMarks.peek().getPhysics() );
            newMarks.poll();
        }

    }
}