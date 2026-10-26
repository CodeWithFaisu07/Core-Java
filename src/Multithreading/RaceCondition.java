package Multithreading;
class carPark implements Runnable{

    @Override
    synchronized public void run() {
        try{
            System.out.println(Thread.currentThread().getName()+" has entered the Park");
                Thread.sleep(4000);
                System.out.println(Thread.currentThread().getName()+" has started to drive the car");
                Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName()+" has came back and park the car");
                 Thread.sleep(4000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

public class RaceCondition {
    static void main() {
        carPark car = new carPark();

        Thread t1 = new Thread(car);
        Thread t2 = new Thread(car);
        Thread t3 = new Thread(car);

        t1.setName("Ramesh");
        t2.setName("Suresh");
        t3.setName("Mahesh");

        t1.start();
        t2.start();
        t3.start();

        // this Happens Race condition here so if YOu run this Program
        //Both thread are Work togather so in real life it's make scence because there is only one car and 3 threads are tryig to uuse it uses same car at a time
        // so this program can run and excute in code but in reak life ramesh suresh and mahesh can't exchange rescoures at a sane time

        // so here is solution for it if you add synchronized keyword in begining of void run()

        // one more thing you can notice in the code there are three Thread Ramesh Suresh and mahesh and three tasks are there
        // so Look at First task this task is about entering in parking so you ramesh suresh and mahesh can do it at a time entring in parking can do Multiple things it's not a problem all can do it without interputing anyone but they can not drive at once
        //but our code behaviour is like that first thread one can enter in the park and wait and drive the can and wait and then came back and park it again Other Thread is waiting for now but task 1 entering into park can do anyone at same time
        // so how we can make Our codes behaviour like this requirment where all can enter in park at a time but drive and came back also do by 1 thread
        //  public void run() {
        //        try{
        //            System.out.println(Thread.currentThread().getName()+" has entered the Park");
        //                Thread.sleep(4000);
        //                syncronized(This){
        //                System.out.println(Thread.currentThread().getName()+" has started to drive the car");
        //                Thread.sleep(4000);
        //            System.out.println(Thread.currentThread().getName()+" has came back and park the car");
        //                 Thread.sleep(4000);
        //             }
        //            } catch (InterruptedException e) {
        //                e.printStackTrace();
        //            }
        //        }
        //    }
        // i'm removing Syncronized from rum method and adding on which tasks we have to need to make it Synchronized

    }
}
