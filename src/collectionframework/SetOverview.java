package collectionframework;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;


public class SetOverview {
    static void main() {
        //set is a collection That cannot contain Duplicates Element
        //Operation: Faster
        //MAP-> HashMap , LinkedHashMap , TreeMap , EnumMap
        //same in set
        //Set : HashSet , LinkedHashSet , TreeSet , EnumSet

        NavigableSet<Integer> set = new TreeSet<>();
        set.add(12);
        set.add(1);
        set.add(1);
        set.add(67);

        //we can all the Method We are using in collectionFramework and MAps
        System.out.println(set);
        System.out.println(set.contains(12));
        System.out.println(set.remove(67));
        System.out.println(set);
        set.clear();
        for(int ele : set){
            System.out.println(ele);
        }


        // for thread Safety
        //we can Make thread safe using it but its not consider in good Practices
        Set<Integer> integers = Collections.synchronizedSet(set);
        // so if you want to thread Safety then you can use ConcurruntSkipSet
        ConcurrentSkipListSet<Integer > set1 = new ConcurrentSkipListSet<>();
        //This Provide You a best Thread Safety so Most recommended Way if you want thread Safety and Concurrency inside your Set Program
         //but if we Want to use set Which is Provide thread Safty then you Should go for copyonArrayListSet
    }

}
