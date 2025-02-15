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
