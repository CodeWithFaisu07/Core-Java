package map;

import java.util.HashMap;

public class HashandEquals {
    static void main() {
        HashMap<Student,String> map= new HashMap<>();
        Student s1 = new Student("Alice",1);
        Student s2 = new Student("Bob",1);
        Student s3 = new Student("Alice",1);
        map.put(s1,"Engineer");
        map.put(s2,"Designer");
        map.put(s3,"Manager");

        System.out.println("HashMap Size  : "+map.size());
        System.out.println("value for p1  : "+map.get(s1));
        System.out.println("value for p3  : "+map.get(s3));


    }
}
class Student{
    private String  name;

    private int id;

    Student(String name, int id){
        this.name=name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
