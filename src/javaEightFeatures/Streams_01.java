package javaEightFeatures;
//Stream is a concept introduced in Java 8 that allows us to process collections/data in a more declarative and concise way.
// The Stream API provides methods such as filter(), map(), sorted(), reduce(), and collect() to perform various data-processing operations.

import java.util.Arrays;
import java.util.stream.IntStream;

public class Streams_01 {
    static void main() {
        //Imperative Approach
        int[] arr ={1,2,3,4};
        int sum = 0;
        for (int i = 0 ; i< arr.length;i++){
            if(arr[i]%2==0){
                sum+=arr[i];
            }
        }
        // Stream Approach
        int[] arr2= {1,2,3,4,5};
        IntStream sum2 = Arrays.stream(arr2).filter(n->n%2==0);
    }
}
