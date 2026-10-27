package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapExample {
    static void main() {
        LinkedHashMap<String, String> mp1=new LinkedHashMap();
        //map->key+value (entry)
        mp1.put("first","apple");
        mp1.put("second","mango");
        mp1.put("third",null);
        mp1.put(null,null);

        mp1.replace("third",null,"straw");
        System.out.println(mp1);
    }
}
