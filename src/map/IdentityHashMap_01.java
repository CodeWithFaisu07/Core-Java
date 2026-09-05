package map;

import java.util.*;
import java.util.Map;

public class IdentityHashMap_01 {
    static void main() {
        String key1 = new String("key");
        String key2 = new String("key");
        Map<String,Integer> mapp = new HashMap();
            mapp.put(key1,1);
            mapp.put(key2,2);
        System.out.println(mapp);


    }
}
