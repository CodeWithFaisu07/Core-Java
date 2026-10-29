package Multithreading;
class Producer extends Thread{

    kyu q;
    int i = 1;

    public Producer(kyu q){
        this.q=q;
    }

    @Override
    public void run() {
        while (true) {
            q.produce(i++);
        }
    }


}
class Consumer extends Thread{
    kyu q;
    public Consumer(kyu q){
        this.q=q;
        @Override
        public void run() {
            while (true) {
                q.Consume();
            }
        }

}
class kyu{
    int data;
    public void produce(int i){
        data = i;
        System.out.println("I have Produced Data  "+data);
    }
    public void Consume(){

        System.out.println("I have Consume Data  "+data);
    }

}

public class Producer_Consumer_InterThreadCommunication {
    static void main() {

        kyu q = new kyu();

        Producer prod = new Producer(q);
        Consumer cons = new Consumer(q);

        prod.start();
        cons.start();

    }
}
