package exception_handling;

public class ExceptionHandling {
    static void main() {
      int a=10;
      int b=0;
//        System.out.println(a/b); exception Happens here because we can not divide by zer0
        //handling it trough try or catch block
        try {
            int c = a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
