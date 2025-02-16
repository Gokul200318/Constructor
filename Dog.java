// Parameterized Constructor:
// Write a Java program to create a class called Dog with instance variables name and color. Implement a parameterized constructor that takes name and color as parameters and initializes the instance variables. Print the values of the variables.

public class Dog {

    String name;
    String color; 

    public Dog(String name, String color){
          this.name = name;
          this.color = color;
          
    }
    public static void main(String[] args) {
        Dog mydog = new Dog("ram", "Black");
        Dog mydog1 = new Dog("mani", "White");
        System.out.println(mydog.name + ":" + mydog.color);
        System.out.println(mydog1.name + ":" + mydog1.color);
    }


}
