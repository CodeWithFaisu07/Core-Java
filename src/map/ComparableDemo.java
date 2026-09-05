package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ComparableDemo {
    static void main() {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student("Alice",1);
        Student s2 = new Student("Bob",1);
        Student s3 = new Student("Alice",1);
        list.sort(null);
        System.out.println(list);
        // if we Want to print it the answer will be null also but if we Want to Print list in natural Order we sould
        // we should have to Implements Comperable  interface First


//        //but in the Case of Integer Value the Value Will be printed in Natural Order Naturally Even if we assigning the Sorting order equals to null
//         //
//        List<Integer> number = new ArrayList<>();
//        number.add(2);
//        number.add(1);
//        number.add(99);
//        number.sort(null);
//        System.out.println(number);// so you can see here in output it Maintains a Natural Order Even Sorting Order is Null
    }



}
