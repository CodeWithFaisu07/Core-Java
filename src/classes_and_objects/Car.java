package classes_and_objects;

public class Car {
    String brand;
    String model;

    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println();
    }

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Fortuner";

        Car car2 = new Car();
        car2.brand = "Hyundai";
        car2.model = "Creta";

        Car car3 = new Car();
        car3.brand = "Mahindra";
        car3.model = "Scorpio";

        car1.display();
        car2.display();
        car3.display();
    }
}

