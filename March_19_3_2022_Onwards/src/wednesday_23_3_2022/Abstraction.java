package wednesday_23_3_2022;

abstract class Animal2{
    abstract public void walk();
    Animal2(){
        System.out.println("u r creating a new animal");
    }
    public void eats(){
        System.out.println("animal eats");
    }
}
class Horse extends Animal2{
    Horse(){
        System.out.println("created a horse");
    }
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Hen extends Animal2{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Horse h1=new Horse();
        h1.walk();
        h1.eats();
        Animal2 anm2=new Horse();

    }
}
