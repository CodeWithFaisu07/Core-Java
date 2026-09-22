package javaEightFeatures;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionFN {
    //BiFunction is same as Function But there is a Limit you can only passes a single Argument through input and returns single argument
    //but in the case of BiFunction you can pass 2 input arugments at a time
    static void main() {
        Function<String,Integer> function = x->x.length();
        System.out.println(function.apply("faisal"));

        BiFunction<String,String,Integer> biFunction = (x,y)->x.length()+y.length();
        System.out.println(biFunction.apply("faisal","khan"));

    }
}
