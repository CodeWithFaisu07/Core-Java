package classes_and_objects;

public class Book {
    String name;
    float price;
    //constructor 01
    Book(){
        System.out.println("This is a very Important Book for Engineers ");
    }
    //constructor 2
    Book(String name){
        this.name = name;
        System.out.println("Name of book: "+name);
    }
    //constructor 3
    Book(String name ,  float price){
        this.name= name ;
        this.price = price;
        System.out.println("Name of Book :"+name);
        System.out.println("Price of Book :"+ price);


    }


    static void main() {

        Book b1 = new Book();
        Book b2 = new Book ("Operating System");
        Book b3 = new Book("Computer Networks", 1500);
    }

}
