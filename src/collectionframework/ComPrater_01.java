package collectionframework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class IntLengthComprater implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1; // 9 5
    }
}

public class ComPrater_01 {
    static void main() {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(9);
        list.add(5);
        list.sort(new IntLengthComprater());
        System.out.println(list);

    }
}
