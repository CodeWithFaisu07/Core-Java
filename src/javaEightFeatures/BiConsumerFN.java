package javaEightFeatures;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerFN {
    // we already Studied about Consumer FUnction its take a Argument but does not return anything so
    static void main() {
        Consumer<Integer> consumer =(x)-> System.out.println(x);
        consumer.accept(100);
        // you can see here you can already take a single argument at a time In consumer so we can take 2 Arguments
        //we can take 2 argument in BIConsumer let's code and check
        BiConsumer<Integer,Integer> biConsumer = (x,y)->{
            System.out.println(x+y);
        };
        biConsumer.accept(100,240);
    }
}
