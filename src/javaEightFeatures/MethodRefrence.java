package javaEightFeatures;

import java.util.Arrays;
import java.util.List;

public class MethodRefrence {
    public static void Print(String s ){
        System.out.println(s);
    }
    static void main() {
        //Method refrence Operator is used to refer a method and this is the Symbol of Method refrence(::)
        // Method refrence is used to in place of lambda Expression
        //Example:-
        List<String> collageStudent = Arrays.asList("Bob","Alice","Reacher");
        collageStudent.forEach(x-> System.out.println(x)); // so Insted of Writing this Lambda xpression we can use method refrence
        collageStudent.forEach(MethodRefrence::Print); //-> its means Print those method which is Avl in MethodRefrence class so here we are just refer the Method using class name
          // we are using Method refrence directly because of the refrence Method is Static if the method is not Static we must have to create a Object of Refrence Method isnide main()


    }
}
