package Multithreading;
class Library implements Runnable{
    String res1 = "java";
    String res2 ="DSA";
    String res3 ="Spring Boot";
    @Override
    public void run() {
        String name =Thread.currentThread().getName();
        if (name.equals("Student1")){
            try
            {
                System.out.println("Studnet1 got into Library");
                Thread.sleep(3000);
                synchronized (res1)
                {
                    System.out.println("Student1 has acquire "+res1);
                    Thread.sleep(4000);
                    synchronized (res2){
                        System.out.println("Studnet1 has acquire"+res2);
                        Thread.sleep(4000);
                        synchronized (res3){
                            System.out.println("Student1 has acquire "+res3);
                        }
                    }
                }

            }
            catch (Exception e) {
                e.printStackTrace();
            }
    }
        else {
            try{
                Thread.sleep(3000);
                synchronized (res3){
                    System.out.println("Studnet 2 acquire"+res3);
                    Thread.sleep( 3000 );
                    synchronized (res2){
                        System.out.println("Studnet 2 has acquire "+res2);
                        Thread.sleep(3000);
                        synchronized (res1){
                            System.out.println("Studnet 2 has accquire"+res1);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        }
}

public class DeadLock_01 {
    static void main() {
        Library lib = new Library();

        Thread thread1 = new Thread(lib);
        Thread thread2 = new Thread(lib);

        thread1.setName("Student1");
        thread2.setName("Student2");
        thread1.start();
        thread2.start();

    }
}
