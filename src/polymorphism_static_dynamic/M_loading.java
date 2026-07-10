package polymorphism_static_dynamic;
class Naya{
    public void methodOne(String n){
        System.out.println("string version>>");
    }
    public void methodOne(Object o){
        System.out.println("Object Version>>");
    }
}

public class M_loading {
    static void main() {
      Naya na  = new Naya();
      na.methodOne("faisal");  //string Exact Match are Available
      na.methodOne(new Object());  // Object Exact Match are Available
      na.methodOne(null);       // Which method a null can take the answer is String because object is like Parant and String is like a child so child can ve used this function

    }

}
