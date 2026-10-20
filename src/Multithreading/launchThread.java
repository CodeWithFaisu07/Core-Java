package Multithreading;

public class launchThread {
    static void main() throws InterruptedException {
//        System.out.println("Application Started...");
//        Thread.sleep(5000);
//        System.out.println("Application Terminated...");


        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());  // -> Output main -> The main thread is the first thread that starts executing your Java program. The JVM starts it and uses it to execute your main() method.
        System.out.println(thread.getPriority());  // -> output 5 because it's the default value of thread Priority
        Thread.sleep(4000);
        thread.setName("Faisal");        // -> Change Thread name
        thread.setPriority(3);           // -> Change Priority
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());

    }
}
