package collectionframework;

import java.util.Arrays;
import java.util.Vector;

public class VectorDemo {
    static void main() {
        Vector<Integer> vector = new Vector<>(5,3);
        // like arraylist the default Capacity of Vector is then and its grow 2 x time if the capacity Reach then its grow and Capcity will 2x .
        //to save 2x grow we can capacity increment in Consructor of vector

        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);


        System.out.println(vector.capacity());
        System.out.println(vector);

        Vector<Integer> vector1 = new Vector<>(Arrays.asList(2,3,4));
        System.out.println(vector1);

    }
}
