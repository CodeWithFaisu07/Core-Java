package javaEightFeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConstructorRefrenceTestClass {
    static void main() {
        List<String> names = Arrays.asList("Harington","charley","John");
        List<ConstrutorRefrenceJavaEight> student = names.stream().map( ConstrutorRefrenceJavaEight::new).collect(Collectors.toList());

    }

}
