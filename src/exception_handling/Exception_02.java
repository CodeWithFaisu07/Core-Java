package exception_handling;

public class Exception_02 {
    static void main() {
        level01();

    }
    public static void level03(){
        int[] arr=new int[5];
        arr[5]=10;

    }
    public static void level02(){
        level03();
    }
    public static void level01(){
        level02();
    }
}
