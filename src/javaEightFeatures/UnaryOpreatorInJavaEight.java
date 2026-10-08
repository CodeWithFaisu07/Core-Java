package javaEightFeatures;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOpreatorInJavaEight {
    static void main() {
        //let's Understand Unary Operator
        // so we are using Function Interface In Java where we can right inside what is Your Input and Output type
        Function<String,String> function1 = str -> str.toLowerCase();
        Function<Integer,Integer> function2 = x -> x*x;
        // so You can see those functions its take same Input and returns same output as well so for this Condition we can use UnaryOperator
        UnaryOperator<Integer> function3 = x-> x*x;  // so here you can see its same as Function Interface but in this Case you have not writing input or output so basiclly its take same input and returns same type of output
        System.out.println(function3.apply(5));
        // unaryOpreators use When Input type and output type is same
        // so Unaryoperator is Special case of Function Interface
    }
}
