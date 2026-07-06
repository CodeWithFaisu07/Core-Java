package classes_and_objects;


 class StudentDefaultConstructor {
     String name;
     int rollNo;

     StudentDefaultConstructor() {
         name = "Faisal;";
         rollNo=22;
         System.out.println("Object Created Successfully");
     }

     void display() {
         System.out.println(name + rollNo);
     }
 }
class Student1 {
    static void main() {
        StudentDefaultConstructor s1 = new StudentDefaultConstructor();
        s1.display();
    }
 }


