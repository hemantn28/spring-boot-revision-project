package tuesday_22_3_2022;

abstract class Parent5{
    public Parent5(){
        System.out.println("I am the constructor of Base5");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}
class Child5 extends Parent5{

    public void greet(){
        System.out.println("Good morning");
    }
}
abstract class Child6 extends Parent5{
    public void th(){
        System.out.println("i m good");
    }
}
public class Abstract_CWH {
    public static void main(String[] args) {
        Child5 c=new Child5();



    }
}
