package inheritance;
// Super Class
class Person{
    String name;
   String address;
   int age;
}
class Student extends Person{ //sub class
    int marks;
    char grade;
    Student(String name,String address , int age,int marks,char grade){
        this.name= name;
        this.address= address;
        this.age=age;
        this.marks=marks;
        this.grade=grade;




    }
    public void display(){
        System.out.println(name);
        System.out.println(address);
        System.out.println(age);
        System.out.println(marks);
        System.out.println(grade);


    }
}

public class SinglyInheritance {
    static void main() {
        Student s1 = new Student("Faisal","Patna",22,390,'A');
        s1.display();
    }
}
