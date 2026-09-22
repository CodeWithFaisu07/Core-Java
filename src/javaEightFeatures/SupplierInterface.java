package javaEightFeatures;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//The Supplier<T> interface is a built-in functional interface introduced in Java 8
// as part of the java.util.function package.
// It represents an operation that takes no input arguments but returns a result of type T.
// Because it is a functional interface,
// it can be seamlessly used with lambda expressions and method references
public class SupplierInterface {
    static void main() {
        Supplier<Integer> supplier0 = ()-> 1;
        System.out.println(supplier0.get());
        // so That is all about Supplier
        //Let's Write a code and Use all the Inbuilt Function at once

        Predicate<Integer> predicate =x -> x%2==0;
        Function<Integer,Integer> function = x-> x*x*x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier= ()-> 100;
        if(predicate.test(supplier.get())){
            consumer.accept(1000);
        }





    }
}
