package Multithreading;

import java.util.Scanner;

public class LaunchThread2 {
    static void main() throws InterruptedException {
        System.out.println("Application Started...");

                     //Task 1
        System.out.println("Banking Activity Started");
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the user Number ");
        int un = sc.nextInt();
        System.out.println("Enter the Password");
        int pass = sc.nextInt();
        System.out.println("collect your cash...");
        System.out.println("Banking Activity Terminated");



                     // Task 2
        System.out.println("Printing activity started");
        for (int i = 0; i < 4; i++) {
            System.out.println("**");
            Thread.sleep(4000);
        }
        System.out.println("Printing activity Terminated ");



                       // task 3
        System.out.println("Printing Important message");
        for (int i = 0; i < 4; i++) {
            System.out.println("focus is the key to master any skills ");
            Thread.sleep(4000);
        }
        System.out.println("Important message terminated ");

        System.out.println("Application Terminated...");

        // In conclusion_> this is a basically a single Threaded java Program and in these Program there are three Independent tasks are there :
          //1) related to banking activty  2) related to Printing  3) related to Important Mesaage   -> so these are Three tasks happens in this a single threaeded program
        // there is Only main thread are working behind main method to be excute it and all the task can excute one by one so these is a Problem because if for some resons if thread one is not to be executed then other tasks are also won't be executed it's waste the CPU time
        // we already know today's application able to do multiple tasks at a time but in case of it another tasks won't be executed if any one face failure and and have erorr
        // to bridge this gap thread are introduced


    }
}
