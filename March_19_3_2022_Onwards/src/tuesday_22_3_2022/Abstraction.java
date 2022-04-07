package tuesday_22_3_2022;

abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("u r creating a new animal");
    }
    public void eats(){
        System.out.println("animal eats");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("created a horse");
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

public class Abstraction {
    public static void main(String[] args) {
    Horse h1=new Horse();
    h1.walk();

    }

}
