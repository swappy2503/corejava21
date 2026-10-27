package collection;

import java.util.ArrayList;

public class List1Example {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        list.set(1,15);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("java");
        list1.add("python");
        list1.add("c++");
        System.out.println(list1);
        list1.remove(0);
        System.out.println(list1);
        System.out.println(list1.reversed());

    }
}
