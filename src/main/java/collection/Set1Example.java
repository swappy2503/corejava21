package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Set1Example {
    static void main() {

ArrayList<String> list1 = new ArrayList<String>();
list1.add("qwerty");
list1.add("asdfgh");
list1.add("zxcvbn");
list1.add("qwerty");
list1.add("asdfgh");

        HashSet<String> set1 = new HashSet<String>(list1);
        set1.add(null);

        Iterator<String> iterator = set1.iterator();
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
