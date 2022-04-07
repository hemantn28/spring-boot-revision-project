package monday_21_3_2022;

public class MyAnimal {
    String name;
    int weight;

    public void run(){
        System.out.println("It can run");
    }

}
class Dog extends MyAnimal{
    String color;
    int age;

    public void bark(){
        System.out.println("dog is barking");
    }

    public static void main(String[] args) {
        MyAnimal ma=new MyAnimal();



        Dog dg=new Dog();
        dg.name="Tommy";
        dg.weight=25;
        System.out.println(dg.name+" "+dg.weight);
        dg.run();
        dg.color="white";
        dg.age=4;
        dg.bark();
        System.out.println(dg.color+" "+dg.age);

    }
}
