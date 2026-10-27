package java8;

import java.util.Arrays;
import java.util.List;

public class Java8ParallelStreams {
    static void main() {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9);
        numbers.parallelStream().forEach(n->System.out.println("Thread: "+Thread.currentThread().getName()+" Number: "+n));
    }
}
