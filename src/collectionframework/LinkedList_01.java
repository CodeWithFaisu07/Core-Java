package collectionframework;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList_01 {
    static void main() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.get(2);
        linkedList.addLast(4);
        linkedList.addFirst(0);
        System.out.println(linkedList);
        linkedList.getFirst();
        linkedList.getLast();
        linkedList.removeIf(x -> x%2 == 0);
        System.out.println(linkedList);


        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat","Dog","Elephent"));
        LinkedList<String > animalToRemove = new LinkedList<>(Arrays.asList("Dog","lion"));
        animals.removeAll(animalToRemove);
        System.out.println(animals);

    }
}
