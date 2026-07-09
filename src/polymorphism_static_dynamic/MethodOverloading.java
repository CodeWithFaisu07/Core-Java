//In this Program we are implement Static polymorphism (its type of polymorphism)
//so to Achieved Static Polymorphism we are using Method Overloading

package polymorphism_static_dynamic;

class Calculator{
    void add(int a,int b){
        System.out.println ("INT_INT Argument used");
    }
    void add(float a,float b){
        System.out.println ("FLOAT_FLOAT Argument used");
    }
    void add(double a,double b){
        System.out.println ("DOUBLE_DOUBLE Argument used");
    }

}

public class MethodOverloading {
    static void main() {
        Calculator c = new Calculator();
        c.add(10, 29);
    }
}
