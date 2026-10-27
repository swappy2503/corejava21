package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example3 {
    static void main() {
       IntStream.range(1,5).forEach(n->System.out.println("Thread: "+Thread.currentThread().getName()+" Number: "+n));
    }
}