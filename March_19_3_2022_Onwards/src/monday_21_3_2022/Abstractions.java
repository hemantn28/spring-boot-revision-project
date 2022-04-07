package monday_21_3_2022;

abstract class Animal{
    abstract public void walk();

    Animal(){
        System.out.println("u r creating a new animal");
    }

    public void eat(){
        System.out.println("Animal eats");
    }

}
class Horse extends Animal{
    Horse(){
        System.out.println("Created a horse");
    }
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}

public class Abstractions {
    public static void main(String[] args) {
        Horse hs1=new Horse();

    }
}

