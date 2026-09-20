package collectionframework;

import java.util.*;

public class DeqeueBasics_02 {
    static void main() {
        Deque<Integer> q = new ArrayDeque<>() ;
        q.offer(10);
        q.offerFirst(5);
        q.offerLast(50);
        System.out.println(q);
        q.pollLast();
        System.out.println(q);



    }
}
