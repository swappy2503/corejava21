package collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Q1Example {
    static void main() {
        PriorityQueue<String> obj=new PriorityQueue<String>();
        obj.add("qwerty");
        obj.add("abcdef");

        ArrayDeque<Integer> obj2=new ArrayDeque<Integer>();
        obj2.add(99);
        obj2.add(3);
        obj2.add(4);
        obj2.add(7);

        //System.out.println(obj2);
        obj2.addFirst(11);
        //System.out.println(obj2);
        obj2.addLast(13);
        System.out.println(obj2);
        obj2.add(3);
        obj2.add(4);
        obj2.add(7);

        obj2.pollLast();
        System.out.println(obj2);

        obj2.removeLastOccurrence(3);
        System.out.println(obj2);


    }
}
