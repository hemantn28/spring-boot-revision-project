package sunday_20_3_2022;

abstract class Animal1{
    abstract void walk();
    Animal1(){
        System.out.println("U r creating a new animal");
    }
    public void eat(){
        System.out.println("Animal eats");
    }

}
class Horse extends Animal1{
    Horse() {
        System.out.println("Created a horse");
    }

    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal1{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Horse horse1=new Horse();
        horse1.walk();
        horse1.eat();




    }
}
