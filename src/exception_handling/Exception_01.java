package exception_handling;

public class Exception_01 {
    static void main() {
        int[] nominator ={10,40,80,45};
        int[] denominator ={ 10, 20, 0, 4};
        for (int i = 0; i <nominator.length ; i++) {
            System.out.println(divide(nominator[i],denominator[i]));

        }
        System.out.println("Good Job");
    }
    public static  int divide(int a , int b ){
        try{
            return a/b;
        } catch (ArithmeticException e) {
            System.out.println(e);
            return -1;

            //we Can add Multiple Catch blocks but in Right Order .
            // catch (Exception e) {
            //      System.out.println(e);
            //       return -1
            // catch (ArithmeticException e) {
//                    System.out.println(e);
//                     return -1;
//             catch (ArithmeticException e) {
//                    System.out.println(e);
//                     return -1;
            //Given MUltiple Catch block is trough a compile time error
            // coz its given in Wrong order because all Exception Caught at Parent Class Exception
            //According to Hirarchy of Exception Handling Exception e is Parent Class and arthimatic or null pointer are sub classes
   // Given Below is the right order where we define Exception block at the end and other subclass at first
            //catch (ArthmeticException e) {
            //      System.out.println(e);
            //        return -1
            //catch (NullPointerException e) {
            //        System.out.println(e);
            //        return -1;
            //catch (Exception e) {
            // System.out.println(e);
            // return -1;
        }
    }

}
