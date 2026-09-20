package javaEightFeatures;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorUsingLambda {
    static void main() {
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(10);
        arraylist.add(90);
        arraylist.add(94);
        arraylist.add(88);
        arraylist.add(4);
        arraylist.add(1);
        Collections.sort(arraylist);
        System.out.println(arraylist); // assending Order Natural  but if you want this sort this into desending order
        // the manuaal way to do this is using Implementing Comparator class but we are not go through with manual way insted of this we are using lambda function here
        Collections.sort(arraylist, (a,b)-> b - a) ;
        System.out.println(arraylist);

    }
}
