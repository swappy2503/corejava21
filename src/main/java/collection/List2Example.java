package collection;

import java.util.LinkedList;
import java.util.Vector;

public class List2Example {
    static void main() {
        Vector<Integer> list = new Vector<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        LinkedList<String> list1 = new LinkedList<String>();
        list1.add("java");
        list1.add("python");
        list1.add("c++");
        System.out.println(list1);
        list1.peekFirst();

    }
}
