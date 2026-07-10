package polymorphism_static_dynamic;
class Parent{
    public void property()
    {
        System.out.println("GOLD+LAND+HOUSE");
    }
    public void marry(){
        System.out.println("Relatives Girl");
    }
}
class Child extends Parent{
    @Override
    public void marry() {
        System.out.println("Another Girl");;
    }
}

public class MethodOverriding {
    static void main() {
        //Parent Object
        Parent p1 = new Parent();
        p1.property();
        p1.marry();
        System.out.println();

        //child Object
        Child c1 = new Child();
        c1.property();
        c1.marry();
        System.out.println();

        //child Object
        Parent p2 = new Child();
        p2.property();
        p2.marry();
    }
}
