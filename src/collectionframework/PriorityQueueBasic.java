package collectionframework;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasic {
    static void main() {
        //Priority Queue Default Behaviour -> Integer -> Less Value -> Higher Priority -> MIN HEAP
        // for String or Your Custom Object you need to Write Down the Comprator for Gives the Priority
        Queue<Integer> pq = new PriorityQueue<>();                     
        pq.offer(40);
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        System.out.println(pq);
        System.out.println(pq.poll());
        pq.poll();
        System.out.println(pq);
    }
}
