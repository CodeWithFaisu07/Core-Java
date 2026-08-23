package collectionframework;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArray_01 {
    static void main() {


//        List<String> shoppingList = new ArrayList<>();
//        shoppingList.add("Milk");
//        shoppingList.add("Eggs");
//        shoppingList.add("Bread");
//        System.out.println("Initial Shopping List: " + shoppingList);
//
//        for (String item : shoppingList) {
//            System.out.println(item);
//            // Try to modify the list while reading
//            if (item.equals("Eggs")) {
//                shoppingList.add("Butter");
//                System.out.println("Added Butter while reading.");
//            }
//        }
//        System.out.println("Updated Shopping List: " + shoppingList);
//        // so yaha pe Exception Aajaega because of things are not Stable here but hum usko Arraylist change karke
//        //copyonWriteArrayList kar de to ye Execute ho jaega





                CopyOnWriteArrayList<String> shoppingList =
                        new CopyOnWriteArrayList<>();

                shoppingList.add("Milk");
                shoppingList.add("Eggs");
                shoppingList.add("Bread");

                System.out.println("Initial Shopping List: " + shoppingList);

                for (String item : shoppingList) {

                    System.out.println(item);

                    // Modify the list while reading
                    if (item.equals("Eggs")) {
                        shoppingList.add("Butter");
                        System.out.println("Added Butter while reading.");
                    }
                }

                System.out.println("Updated Shopping List: " + shoppingList);
    }
}
