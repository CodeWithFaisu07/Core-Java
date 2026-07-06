package classes_and_objects;

class ParmatrizedConst {
    int x;
    int y;

    ParmatrizedConst(int x, int y) {
        this.x = x;
        this.y = y;

    }

    void Display() {
        System.out.println("x = " + x + " And " + " Y = " + y);
    }
}
class Bachaa{
         public static void main() {
           ParmatrizedConst s1 = new ParmatrizedConst(100,200) ;
           s1.Display();
        }

}

