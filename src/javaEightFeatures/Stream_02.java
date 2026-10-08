package javaEightFeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_02 {
    static void main() {
        // we can convert Methods in form of stream
        List<String> list = Arrays.asList("Apple","banana","Cherry");
        Stream<String> stream = list.stream();

          // we can also Convert Array as Stream Method
        String[] array = {"Apple","banana","Cherry"};
        Stream<String> stream1 = Arrays.stream(array);

          // Stream Creation-01
        Stream<Integer> myStream = Stream.of(1,2,3,4);

       // Stream Creation-02
        Stream<Integer> limit = Stream.iterate(0,n->n+1).limit(67);

        // stream Creation - 03
        Stream.generate(()->"hello").limit(5);

    }
}
