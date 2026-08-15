package collectionframework;

import java.util.ArrayList;

public class ArrayList_01 {
    static void main() {
        ArrayList<Integer> list = new ArrayList<>(4);
        list.add(0,5);
        list.add(1,50);
        list.add(2,80);
        list.add(88);
        System.out.println(list.get(0));
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        for(int ele: list){
            System.out.print(list+",");
        }
        System.out.println(list.contains(5));
        System.out.println(list.contains(44));
        System.out.println();
        list.remove(3 );
        list.set(0,7);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+",");
        }


    }
}
