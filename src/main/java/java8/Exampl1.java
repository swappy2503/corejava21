package java8;

import java.util.*;

public class Exampl1 {
    static void main() {
    Map<String, Double> map = new HashMap<>();
    map.put("Milk", 1.4);
    map.put("Bread", 2.2);
    map.put("Eggs", 3.1);

    map.replaceAll((p, q) -> q * 1.1);
    map.forEach((item, price) -> System.out.println(item + ": " + price));
    }
}
