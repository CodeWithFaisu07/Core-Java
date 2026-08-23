package map;

import java.lang.ref.WeakReference;

public class WeakHashMapGC_01 {
    static void main() {
        // this is strong Reference and Java does not Do Garbage Collection WhenEver we are not telling phone = null
//    Phone phone = new Phone("17 Pro Max ", "Apple");
//        phone = null;
//        System.out.println(phone);

        //this is WeakReference
        WeakReference<Phone> weakReference = new WeakReference<>(new Phone("105", "Nokia"));
        System.out.println(weakReference.get());
        System.gc();
        try{
            Thread.sleep(10000);
        } catch (Exception ignored) {
        }
        System.out.println(weakReference.get());

    }
}

class Phone{
    String brand;

    String model ;

    public Phone(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }
// We are Overriding to string method because there is no method to Print the Details
    //if you creting a method to display output then you don't need override to string function
    //however in this case we are not Defining any method to display details and trying to print directly object that's why to string method overrride is used
    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
