// Constructor Overloading
// Write a Java program to create a class called "Book" with instance variables title, author, and price. Implement a default constructor and two parameterized constructors:

public class Book {

    String title;
    String author;
    int price;

    public Book(String title, String author){

        this.title = title;
        this.author = author;
        this.price = 50;
    }
    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public static void main(String[] args) {
        Book mybook = new Book("habits", "gokul",300);
        System.out.println(mybook.title + ":" + mybook.author +":" + mybook.price);
    }
}
