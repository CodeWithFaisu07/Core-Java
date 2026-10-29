package Multithreading;

// this Program is Example of Race Condition
class MSWord extends Thread{
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        switch (name) {
            case "TYPE" -> Typing();
            case "SPELL" -> SpellChecking();
            case "SAVING" -> AutoSaving();
        }


    }
    public void Typing(){
        try{
            for (int i = 0;i<3;i++){
                System.out.println("Typing...");
                Thread.sleep(3000);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void SpellChecking(){
        try{
            for (;;){
                System.out.println("SpellChecking...");
                Thread.sleep(3000);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public void AutoSaving(){
        try{
            for (;;){
                System.out.println("AutoSaving...");
                Thread.sleep(3000);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

public class ThreadLecture2 {
    static void main() {
        MSWord ms1 = new MSWord();
        MSWord ms2 = new MSWord();
        MSWord ms3 = new MSWord();

        ms1.setName("TYPE");
        ms2.setName("SPELL");
        ms3.setName("SAVING");

        ms2.setDaemon(true);  //-> low-priority background thread that provides support services to user (non-daemon) thot reads and does nprevent the Java Virtual Machine (JVM) from exiting
        ms3.setDaemon(true);  //-> if we assiging a thread as a Demon thread its execute that's time when primary Thread execute and its execute atleast one time


        ms2.setPriority(3);
        ms3.setPriority(4);
         ms1.start();
         ms2.start();
         ms3.start();
 // so in this Program Its Faces a Race condition to prevent it we s
        // hould have to set Priority of Thread and set Internal thread as Demonstrativr thred
    }
}
