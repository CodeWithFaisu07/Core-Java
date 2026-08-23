package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_01 {
    static void main() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Faisal");
        map.put(2,"Abid landu");
        map.put(3,"Aftab");


        String student = map.get(3);
        System.out.println(student);

        System.out.println( map.containsKey(2));
        System.out.println("Faisal");

        for (int i : map.keySet()){
            System.out.println(map.get(i));
        }
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer, String> entry : entries){
            entry.setValue(entry.getValue().toUpperCase());
        }

        System.out.println(map);
        map.remove(2);
    }
}
