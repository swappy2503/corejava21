package collection;

import java.util.LinkedHashSet;

public class Set2Example {
    static void main() {
        LinkedHashSet<String> set1 = new LinkedHashSet<String>();
        set1.add("qwerty");
        set1.add("asdfgh");
        set1.add("zxcvbn");
        set1.add(null);

        System.out.println(set1);

    }
}