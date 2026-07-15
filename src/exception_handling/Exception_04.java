package exception_handling;

public class Exception_04 {
    static void main() {
        System.out.println(divide(2,0));

    }
    public static int divide(int a , int b){
        try{
           return a/b;
        } catch (ArithmeticException e) {
            System.out.println(e);
            return -1;
        }
        finally {
            System.out.println("its not a problem either try run or catch finally always Execute!");
        }
    }
}
