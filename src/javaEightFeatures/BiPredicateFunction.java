package javaEightFeatures;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateFunction {
    // BI-Predicate Function is Also a Part of Functionol Interface and it's same as Predicates But In the CAse of
    //Predicates we are using a single Argument To cheak wheather condition is true or False
    // But What if if you have to Cheak Double Argument at a time then What will Happenns How can you do this
    //Jo Solve this Problem Java Provide BIPredicate Function Which cheaks 2 Argument at a time
    //let's Understand Through code
    static void main() {
        Predicate<Integer> cheakEvenOrNot = x -> x%2==0;
        System.out.println(cheakEvenOrNot.test(4)); //-> you can see here only one element at a time can cheak
        BiPredicate<Integer,Integer> biPredicate = (a,b )->a%2==0 && b%2==0;
        System.out.println(biPredicate.test(50,100));

        BiPredicate<String,Integer> cheaksStringLength = (str,x)-> str.length()==x;
        System.out.println(cheaksStringLength.test("faisal",6));

    }
}
