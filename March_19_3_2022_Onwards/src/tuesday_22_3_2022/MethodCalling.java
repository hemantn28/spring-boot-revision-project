package tuesday_22_3_2022;

class Animal3{
    String name;
    int age;
    double weight;

    public void hunt(){
        System.out.println("This animal can hunt");
    }
    public void run(){
        System.out.println("This animal can run");
    }
    public void getInfo(){
        System.out.println(this.name);
        System.out.println(this .age);
        System.out.println(this.weight);
    }

}
class Bird{
    String name;
    double weight;

    public void fly(){
        System.out.println("this bird can fly");
    }
    public void eat(){
        System.out.println("this bird can run");
    }
    public void printInfo(){
        System.out.println(this.name+" "+this.weight);
    }
}
public class MethodCalling {
    public static void main(String[] args) {
        Animal3 anm3=new Animal3();
        anm3.hunt();
        anm3.run();
        anm3.name="Lion";
        anm3.age=10;
        anm3.weight=150.25;
        anm3.getInfo();

        Animal3 anm4=new Animal3();
        anm4.name="Dog";
        anm4.age=5;
        anm4.weight=18.3;
        anm4.getInfo();

        Bird bd=new Bird();
        bd.name="Vulture";
        bd.weight=19.5;
        bd.printInfo();
        bd.fly();
        bd.eat();

        Bird bd2=new Bird();
        bd2.name="Peacock";
        bd2.weight=20.5;
        bd2.printInfo();


    }
}
