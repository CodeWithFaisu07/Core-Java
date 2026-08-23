package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class LinkedHashMap_01 {
    static void main() {


        // you can see there is no Order in HashMap if you Print all the keys and Value it's cannot be Printed in correct Order
        HashMap<String, Integer> hash = new HashMap<>();
        hash.put("Orange",1);
        hash.put("Guava",3);
        hash.put("Grape",4);
        //This is Method Used to Cheak the Value is Present or not if Present then Returns its value Other wise returns defaults value as you set already
        int res = hash.getOrDefault("Banana",0);
        System.out.println(res);
        for(Map.Entry<String, Integer>  entry : hash.entrySet() ){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }


        System.out.println();
        //LinkedHashMap extends HashMap but it's maintain order We can see Same Example
        LinkedHashMap<String , Integer> lhm = new LinkedHashMap<>(10,0.3f,true);
        lhm.put("Orange",1);
        lhm.put("Guava",2);
        lhm.put("Grape",3);
        lhm.get("Orange");
        // so if Access order is True and you can get Element is Print at Last beacuse LRU Algorithem Work here : it's make unused element at top and used element at down so you can see which element have a use and which is unussed hai after find that and you can do with anything you want
        for(Map.Entry<String,Integer> linkMap : lhm.entrySet()){
            System.out.println(linkMap.getKey()+" : "+linkMap.getValue());
        }
        // now You can see Clearly in OutPut Screen LinkedHashMap Maintain Order But Hashmap doesn't Maintain any type od order

    }
}
