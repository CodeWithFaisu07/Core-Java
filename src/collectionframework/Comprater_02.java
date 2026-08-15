package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
class StrLegthComprator implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }
}



public class Comprater_02 {
    static void main() {
        List<String> words = Arrays.asList("banana","apple","date");
        words.sort( new StrLegthComprator());
        System.out.print(words);

    }
}
