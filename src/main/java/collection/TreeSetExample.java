package collection;

import java.util.TreeSet;

public class TreeSetExample {
    static void main() {
        TreeSet<String> set1 = new TreeSet<String>();
        set1.add("qwerty");
        set1.add("asdfgh");
        set1.add("mnop");
        set1.add("zxcvbn");
        System.out.println(set1);

        System.out.println(set1.pollLast());

    }
}
