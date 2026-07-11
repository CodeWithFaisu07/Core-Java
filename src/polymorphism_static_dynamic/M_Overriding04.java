package polymorphism_static_dynamic;
// final is access Modifier and we can say a keyword who helps to restrict from changes
//so if you marked final with class you won't able to di inheritance
// and if you write final with method you cannot do overriding of that Method
// and if you Write it with a variable you can't change the value of that Variable
//if you Uncomment the final keyword on Parents class method then you are not able to do method overriding
class Parent01{
    public /*final*/void method01(){
        System.out.println("ParentClass :: method0ne");
    }
}
class Child01 extends Parent01{
    @Override
    public void method01() {
        System.out.println("ChildClass :: methodOne");
    }
}

public class M_Overriding04 {
    static void main() {
        Parent01 p = new Child01();
        p.method01();
    }
}
