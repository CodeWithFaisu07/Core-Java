package map;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    static void main() {
        ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();
        // java 7 ----> segments bassed locking ---> 16 segments ---> smaller hashmap
        //Only The Segments Being Written to or read from is locked
        //do not require Locking unless there is a Write Operation Happening on the same segment

    }
}
