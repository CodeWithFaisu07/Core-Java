package Multithreading;
// there are two ways to create threads using Thread class or implementing Runnable interface
// in this file we are trying to Learn how we can Create Thread using extending tread class

import java.util.Scanner;
class Alpha extends Thread {
    @Override
    public void run() {
        Banking();
    }
        public void Banking () {
            //Task 1
            System.out.println("Banking Activity Started");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the user Number ");
            int un = sc.nextInt();
            System.out.println("Enter the Password");
            int pass = sc.nextInt();
            System.out.println("collect your cash...");
            System.out.println("Banking Activity Terminated");
    }
}
class Beta extends Thread{
    public void run(){
        try {
            Printing();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void Printing() throws InterruptedException {
        // Task 2
        System.out.println("Printing activity started");
        for (int i = 0; i < 4; i++) {
            System.out.println("**");
            Thread.sleep(4000);
        }
        System.out.println("Printing activity Terminated ");

    }
}
class Gamma extends Thread {
    public void run(){
        try {
            ImportantMsg();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void ImportantMsg() throws InterruptedException {
        // task 3
        System.out.println("Printing Important message");
        for (int i = 0; i < 4; i++) {
            System.out.println("focus is the key to master any skills ");
            Thread.sleep(4000);
        }
        System.out.println("Important message terminated ");
    }

}


public class ThreadClass_01 {
    static void main() throws InterruptedException {
        System.out.println("Application Started...");
        Alpha a =new Alpha();
        Beta b = new Beta();
        Gamma g = new Gamma();


        a.start();
        b.start();
        g.start(); // so here we can create 3 thread and the work of this program is just like main thread run first and the other threads going to be executed
        // so if you want first Complete all the additional thread first and then main method to be executed then we have to use join method
        // so we can use join method to Control concurrency where you can control the flow of thread
        a.join();
        b.join();
        g.join();
        // so here 1st main thread is started and not Execute until all other thread not start and exucte and then in last main thread is Executed


        System.out.println("Application Terminated...");

    }
}
