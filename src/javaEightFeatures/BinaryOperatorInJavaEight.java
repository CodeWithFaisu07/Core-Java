package javaEightFeatures;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInJavaEight {
    static void main() {
        // So we are know already About UnaryOperaotor ( a Special case in function InterFace )
        // so let's move on another Special case of BiFunction called BinaryOperator
        // so we have already discussed about biFunction (basically its a Function Interface we we can pass more then one input Argument and returns a single output argument)
        // so if both of the Input Argument and output Argument are same then we can use BinaryOperator (But both Inputs and one Output Argument will be same)
        BiFunction<String,String,String> biFunction = (str1,str2)-> (str1+str2);
        System.out.println(biFunction.apply("hello","world"));

        // so insted of writing this Bifunction we can use it directly BinaryOperator

        BinaryOperator<String > binaryOperator = (str1,str2)-> (str1+str2);
        System.out.println(biFunction.apply("hello","world"));

    }
}
