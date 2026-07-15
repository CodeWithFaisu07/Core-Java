package exception_handling;
//we are Learning and implementing throws in this Program

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception_03 {
    static void main() throws IOException {
        method01();

    }
    public  static void method02() throws IOException {
        method01();
    }

    public static void method01() throws IOException {
        FileReader fileReader = new FileReader("a.txt");
        throw new IOException("oops nahi mil rha hai file jaake kahi or dudnh lo");

    }
}
