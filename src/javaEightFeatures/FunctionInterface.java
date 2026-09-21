package javaEightFeatures;
//In Java, Function<T, R> is a built-in functional interface introduced in Java 8 (under the java.util.function package)
//that accepts a single input argument of type T and returns a result of type R.
//It is primarily used for data transformation, mapping, or conversion
//T: The type of the input argument.R: The type of the return result.apply(T t):
// Executes the function's logic on the given input and returns the transformed output

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionInterface {
    static <list> void main() {
        Function<String,Integer> function = x->x.length();
        System.out.println(function.apply("Faisal"));


        Function<String,String> function2 = s->s.substring(0,3);
        System.out.println(function2.apply("Faisu"));


        // There are some Default method of Function We are going to studid Now
        // (i)andThen-> default method Under Function
        Function<String,String> function3 = s->s.toUpperCase();
        Function<String,String> function4 = s->s.substring(0,3);
//        Function<String, String> stringStringFunction = function3.andThen(function4);
//        System.out.println(stringStringFunction.apply("Faisal")); in this way we are creating another function to use both of the function
        // we can print directly without using Another FUnction
        System.out.println(function3.andThen(function4).apply("faisal"));

        //compose one of default method inside function and it is same as andThen but it work opposite of anThen
        Function<Integer,Integer> function5 = x->x*2;
        Function<Integer,Integer> function6 = x->x*x*x;
        System.out.println(function5.andThen(function6).apply(3));//226
        System.out.println(function6.andThen(function5).apply(3));//54

        System.out.println(function5.compose(function6).apply(3));

        // Static function - identity()-> in there if you gave anything in input this method return same input as well as
        Function<String, String > identity = Function.identity();
        System.out.println(identity.apply("faisal"));






















//        Function<List<Student124>,List<Student124>> StudentStartWithF = li->{
//            List<Student124> result = new ArrayList<>();
//            for (Student124 s:li){
//               if(function2.apply(s.getName()).equalsIgnoreCase("Fai")){
//                   result.add(s);
//               }
//            }
//            return result;
//        };
//       Student124 s1 = new Student124(2,"Faisal");
//       Student124 s2 = new Student124(4,"Fazal");
//       Student124 s3 = new Student124(6,"Fazhaan");
//        List<Student124> students = Arrays.asList(s1, s2, s3);
//        List<Student124> filterdStudent = StudentStartWithF.apply(students);
//        System.out.println(filterdStudent);


    }
}

//   class Student124{
//       @Override
//       public String toString() {
//           return "Student124{" +
//                   "id=" + id +
//                   ", name='" + name + '\'' +
//                   '}';
//       }
//
//       private int id;
//    private String name;
//
//       public Student124(int id, String name) {
//
//       }
//
//       public int getId() {
//           return id;
//       }
//
//       public void setId(int id) {
//           this.id = id;
//       }
//
//       public String getName() {
//           return name;
//       }
//
//       public void setName(String name) {
//           this.name = name;
//       }
//   }
