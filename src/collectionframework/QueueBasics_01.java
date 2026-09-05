package collectionframework;


import java.util.LinkedList;
import java.util.Queue;

public class QueueBasics_01 {
    static void main() {
        Queue<Integer> q =new LinkedList<>() ;
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        System.out.println(q);

        System.out.println(q.poll());
        System.out.println( q);




    }
}
