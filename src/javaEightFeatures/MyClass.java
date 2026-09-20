package javaEightFeatures;
interface A{
    default void sayHello(){
        System.out.println("A Says Hello");
    }
}
interface B{
    default void sayHello(){
        System.out.println("B Says Hello");
    }
}

public class MyClass implements  A, B {
    public void main(){
        MyClass c = new MyClass();
        c.sayHello(); // -> In this situtation compilor confused Which interFace mathod its use in MYclass A or b so we can have override ot first and then we can use it with using super key

    }

    @Override
    public void sayHello() {
        B.super.sayHello();
    }
}
