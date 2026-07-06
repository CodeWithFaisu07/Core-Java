
    package classes_and_objects;
    class Details{
        int id;
        String name;
        float salary;

        void display(){
            System.out.println("Name : " + name);
            System.out.println("id no : " + id);
            System.out.println("Salary :" + salary);
        }
    }
    public class Employee {
        static void main() {
            Details emp1 = new Details();
            emp1.name="Faisu";
            emp1.id=554;
            emp1.salary= 4000;
            emp1.display();


        }
    }


