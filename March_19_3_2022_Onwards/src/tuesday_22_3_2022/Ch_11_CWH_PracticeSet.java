package tuesday_22_3_2022;

//Q.1.Create an abstract class Pen2 with methods write and refill as abstract methods.
//Q.2.Use a Pen class from Q no.1 to create a concrete class FountainPen with additional method changeNib().

abstract class Pen2{
    abstract void write();
    abstract void refill();

}
class FountainPen extends Pen2{
    void write(){
        System.out.println("write");
    }
    void refill(){
        System.out.println("refill");
    }
    void changeNib(){
        System.out.println("nib");
    }
}
/*Q.3.Create a class Monkey with jump() and bite() methods. Create a class Human which inherits this Monkey class and implements
 BasicAnimal interface with eat() and sleep() methods.*/

class Monkey{
    void jump(){
        System.out.println("monkey is jumping");
    }
    void bite(){
        System.out.println("monkey bites");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
   public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
    void speak(){
        System.out.println("human speaks");
    }
}
/*Q.4.Create a class Telephone with ring(),pick() and disconnect() methods as abstract methods.Create another class as smartTelephone
and demonstrate polymorphism.*/
abstract class Telephone{
    abstract void ring();
    abstract void pick();
    abstract void disconnect();
}
class SmartTelephone extends Telephone{
   public void ring(){
       System.out.println("ringing");
   }
    public void pick(){
        System.out.println("pick call");
    }
    public void disconnect(){
        System.out.println("disconnect call");
    }
    void advanceStuff(){
        System.out.println("does advance stuffs");
    }

}
//Q.6.Create an interface TVRemote And use it to inherit another interface SmartTvRemote.
interface TVRemote{

}
interface SmartTVRemote{

}
public class Ch_11_CWH_PracticeSet {
    public static void main(String[] args) {
        FountainPen fp=new FountainPen();
        fp.write();
        fp.refill();
        fp.changeNib();

        Human human1=new Human();
        human1.eat();
        human1.sleep();
        human1.bite();
        human1.jump();

        //Q.5
        Monkey mk1=new Human();
        mk1.jump();
        mk1.bite();
        BasicAnimal loveesh=new Human();
        loveesh.eat();
        loveesh.sleep();

      Telephone tp=new SmartTelephone();
        tp.ring();
        tp.pick();
        tp.disconnect();
        SmartTelephone smt=new SmartTelephone();
        smt.advanceStuff();
        smt.ring();
        smt.pick();
        smt.disconnect();





    }
}
