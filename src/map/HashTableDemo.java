package map;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {
    static void main() {
//        Hashtable<Integer,String> hashtable = new Hashtable<>();
//        hashtable.put(1,"Apple");
//        hashtable.put(2,"Banana");
//       hashtable.put(3,"Charry");
//        System.out.println(hashtable);
//        System.out.println("value of key 2 :"+hashtable.get(2));
//        System.out.println("Does key 3 exists? : "+ hashtable.containsKey(3));
//        hashtable.remove(2);
//        System.out.println("HashTable After removing :"+ hashtable);


        //Hashtable is Thread Safe but HashMap is not ThreadSafe Lets Understand With an Example
        System.out.println("Thread Program using HashMap/ no thread Safety unpredictable output");
        HashMap<Integer,String> map = new HashMap<>();
        Thread thread1 = new Thread( () -> {
            for (int i = 0 ; i<1000;  i++){
                map.put(i,"Thread1");
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 1000; i <2000 ; i++) {

                map.put(i,"Thread2");
            }

        });
        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Final Size of Hashmap :"+map.size());

        // We can see if we are using hashmap then the size is unpridactly and gives diffrent diffrent output wehen we run many times
        //but if we are using code using hashtable then the output will bw acurate because Hashmap is  thread safe
        //Let's see same code using Hastable
        System.out.println();
        System.out.println("Thread Program Using HashTable:");

        Hashtable<Integer,String> map1 = new Hashtable<>();
        Thread thread3 = new Thread( () -> {
            for (int i = 0 ; i<1000;  i++){
                map1.put(i,"Thread1");
            }
        });
        Thread thread4 = new Thread(() -> {
            for (int i = 1000; i <2000 ; i++) {

                map1.put(i,"Thread2");
            }

        });
        thread3.start();
        thread4.start();
        try{
            thread3.join();
            thread4.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Final Size of Hashmap :"+map1.size());
    }
}
