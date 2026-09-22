package javaEightFeatures;
// We eariler Disscussed about
//Predicate -> Boolean Valued function
//Function -> Operations Performed take any type of Input and provide any type of output

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
//The Consumer Interface is a functional interface available in the java.util.function package,
// introduced in Java 8. It represents an operation that accepts a single input argument and performs an action
// on it without returning any result. Consumer is commonly used for operations such as printing values,
// modifying collections, logging data, and performing side effects.
//
//Functional interface containing a single abstract method.
//Commonly used with Lambda Expressions and Streams.
//Useful for performing side-effect operations.

public class ConsumerInterface {
    static void main() {
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Faisal Khan");

        Consumer<List<Integer>> listConsumer = li ->{
            for(Integer i :li){
                System.out.println(i + 100);
            }
        };
        listConsumer.accept(Arrays.asList(1,2,3,4));
    }
}
