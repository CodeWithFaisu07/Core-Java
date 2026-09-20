package javaEightFeatures;
interface AB {
    static void sayHello(){
        System.out.println("hello Dosto mai Static method hu mere Child classes Mujhe Change nahi kar skate hai or mai dusri class me apne interface ke naam se hi call hounga aaishe nhi hounga mai!");
    }
    default void SayByee(){
        System.out.println("mai default method hu subclass can make Changes me or can have diffrent implementation diffrently and also direct calls :-");

    }

}

public class MyClass2 implements AB{
    static void main() {
        MyClass2 obj = new MyClass2();
//        obj.sayHello();  -> Static Method cannot be Called directly we have to use interface name to call it
        AB.sayHello();
//        obj.sayByee();

    }
}
