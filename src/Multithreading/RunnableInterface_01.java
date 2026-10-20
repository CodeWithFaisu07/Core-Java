package Multithreading;

import java.util.Scanner;

class Alpha1 implements Runnable {
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
class Beta1 implements Runnable{
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
class Gamma1 implements Runnable {
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


public class RunnableInterface_01 {
    static void main() throws InterruptedException {
        System.out.println("Application Started...");
        Alpha a = new Alpha();
        Beta b = new Beta();
        Gamma g = new Gamma();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(g);
//Runnable does not define a start() method. The Thread class provdes start(), and its constructor can accept a Runnable task. beacause of Runnable also extends Thread class



        a.start();
        b.start();
        g.start();

        System.out.println("Application Terminated...");

    }
}
