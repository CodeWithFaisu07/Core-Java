package javaEightFeatures;

public class ThreadUsingLambda {
    static void main() {
        //We are using Lambda Expression here so if you can create a it without Lambda Expression
        //First you need to Implemenmt runnable interface to your class and also Override the   Abstract Method and give it implementation to
        //but by using Lambda function it's not need to IMplement runnable and Override method

        Runnable runnable = () -> {
            for(int i = 0;i<10;i++){
                System.out.println("Hello World");
            }
        };
       Thread ChildThread = new Thread(runnable);
        ChildThread.run();
    }
}
