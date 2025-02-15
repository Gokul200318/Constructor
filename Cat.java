// Write a Java program to create a class called “Cat” with instance variables name and age. Implement a default constructor that initializes the name to "Unknown" and the age to 0. Print the values of the variables.


public class Cat {

    private int age;
    private String name;

    public Cat(){
        this.age = 5;
        this.name = "unknown";
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }



    public static void main(String[] args) {
        Cat mycat = new Cat();
        System.out.println(mycat.getName() + ":" + mycat.getAge());

        
    }
}
