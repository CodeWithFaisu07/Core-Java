package javaEightFeatures;

import java.util.function.Predicate;
public class PredicateProgramm {
    static void main() {
//        Predicate<Integer> predicate = x -> x>100000;
//        System.out.println(predicate.test(10000));
//        int Salary = 90 ;
//        System.out.println(predicate.test(Salary));



        // Predicate 2
        Predicate<Integer> isEven = x-> x%2==0;
        int num = 3;
        System.out.println(isEven.test(num));


        //Predicate 3
        Predicate<String>StartWithLetterV=x->x.toLowerCase().charAt(0)=='v';
        Predicate<String>endsWithLetterV=x->x.toLowerCase().charAt(x.length()-1)=='a';
        String name =  "Vipul Taklia";
        System.out.println(StartWithLetterV.test(name));
        System.out.println(StartWithLetterV.negate().test(name));
        System.out.println(StartWithLetterV.and(endsWithLetterV).test(name));

        Predicate<Object> predicate = Predicate.isEqual("Vipul Taklia");
        System.out.println(predicate.test("Vipul Ganjaa"));

    }
}
