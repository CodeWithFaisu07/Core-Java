//package Multithreading;
//
//import java.util.Scanner;
//
// class alpha3 implements Runnable{
//    @Override
//    public void run() {
//        Thread thread = Thread.currentThread();
//        if(thread.equals("Bank")) Banking();
//        else if (thread.equals("Printing")) {
//            try {
//                Printing();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        } else if (thread.equals("Important")) {
//            try {
//                ImportantMsg();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//        }
//
//    }
//
//
//    }
//    public static void Banking() {
//        //Task 1
//        System.out.println("Banking Activity Started");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the user Number ");
//        int un = sc.nextInt();
//        System.out.println("Enter the Password");
//        int pass = sc.nextInt();
//        System.out.println("collect your cash...");
//        System.out.println("Banking Activity Terminated");
//    }
//    public static void Printing() throws InterruptedException {
//        // Task 2
//        System.out.println("Printing activity started");
//        for (int i = 0; i < 4; i++) {
//            System.out.println("**");
//            Thread.sleep(4000);
//        }
//        System.out.println("Printing activity Terminated ");
//
//    }
//    public static void ImportantMsg() throws InterruptedException {
//        // task 3
//        System.out.println("Printing Important message");
//        for (int i = 0; i < 4; i++) {
//            System.out.println("focus is the key to master any skills ");
//            Thread.sleep(4000);
//        }
//        System.out.println("Important message terminated ");
//    }
//
//}
//
//public class MultiThreadOneRumMethod {
//     public static void main() {
//        alpha3 a1 = new alpha3();
//        alpha3 a2 = new alpha3();
//        alpha3 a3 = new alpha3();
//
//        Thread t1 = new Thread(a1);
//        Thread t2 = new Thread(a2);
//        Thread t3 = new Thread(a3);
//
//        t1.setName("Bank");
//        t2.setName("Printing");
//        t3.setName("Important");
//        t1.start();
//        t2.start();
//        t3.start();
//
//
//    }
//
//
//}
