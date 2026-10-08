package javaEightFeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {
    static void main() {
        // operations on Streams
        //filter Operation
        List<Integer> list = Arrays.asList(1,45,145,45,171,66,165,561,861,186,195,165,16,1);
        List<Integer> filteredlist = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(filteredlist);
        //map() operation
        List<Integer> collect = filteredlist.stream().map(x -> x / 2).collect(Collectors.toList());
        System.out.println(collect);
        //distnict() is also a Stream Operation or API if our List have Dublicates then we are using Distrinct() method to remove that duplicates
        // sorted method is use to sort something
        List<Integer> filteredlist2 = list.stream().filter(x -> x % 2 == 0).distinct().sorted((a,b)->a-b).limit(4).skip(1).collect(Collectors.toList());
        System.out.println(filteredlist2);

        //another Example of Stream Operation
        List<Integer> limit = Stream.iterate(0,x -> x + 1).limit(101).skip(1).filter(x->x%2==0).map(x->x/10)
                .distinct().sorted().peek(x-> System.out.println(x)).collect(Collectors.toList());
        System.out.println(limit);

        // so if Our List is Too Huge we can use Parallel Strems so basically this is same as Streams But this can manage large amount of List by Dividing it's into Chunks
        Stream<Integer> Stream = list.parallelStream();//-> use when list is too Huge



    }
}
