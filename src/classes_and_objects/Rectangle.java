package classes_and_objects;

public class Rectangle {
    float length;
    float breadth;
    float area(){
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
            r1.length = 15;
            r1.breadth= 15;
        System.out.println("Area : "+ r1.area());

        }
    }

