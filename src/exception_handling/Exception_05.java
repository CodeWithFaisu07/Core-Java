package exception_handling;
//we are Learning in this part of chat try with Resourse suppose of you are Working with file then you have always
//use finally for close the file (file.close())but before java 7 u need to right close manually but after
//java 7 we don't need to write the fianlly for close because its provide try with resources where we write dowm
//the resourses inside the try block like this try(resources) and its Automatically closed if needed
//import java.io.*;
//import java.io.BufferedReader;
//import java.io.FileReader;
//
//public class Exception_05 {
//    static void main() {
//        try(BufferedReader reader = new BufferedReader(new FileReader("a.txt"))){
//            String line;
//            while((line= reader.readLine())!=null){
//                System.out.println(line);
//            }
//        catch (IOException e) {
//                System.out.println("IOException Caught")+getMessage();
//            }
//        }
//    }
//}
