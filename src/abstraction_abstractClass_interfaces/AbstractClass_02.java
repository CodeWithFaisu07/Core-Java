package abstraction_abstractClass_interfaces;
 abstract class Person{
    String name;
    int age;
    float height;
    Person(String name , int age,float height){
        this.name=name;
        this.age=age;
        this.height=height;
    }
}
 class Student04 extends Person{
     int marks;
     float avg;
     Student04(String name, int age,float height,int marks,float avg){
         // to call Parametrized Constructor to Parent to Child
         super(name,age,height);
         this.marks=marks;
         this.avg=avg;
     }

     public void display(){
         System.out.println("Name is ::"+name);
         System.out.println("AGE is ::"+age);
         System.out.println("Height is ::"+height);
         System.out.println("Marks is ::"+marks);
         System.out.println("AVG is ::"+avg);

     }
 }

public class AbstractClass_02 {
    static void main() {


        Student04 s = new Student04("Faisal", 20, 6.0f, 440, 90);
        s.display();
    }
}
