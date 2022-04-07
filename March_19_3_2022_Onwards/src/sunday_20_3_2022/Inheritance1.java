package sunday_20_3_2022;

class WildAnimals{
    String name;
    int weight;

    public void prey(){
        System.out.println("Wild animals prey other animals");
    }
}
class Lion extends WildAnimals{
    String color;

    public void hide(){
        System.out.println("Leopard can hide himself from others");
    }
}
class Cub extends Lion{
    int age;

    public void play(){
        System.out.println("cub plays with lion");
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        Inheritance1 inh=new Inheritance1();

    }
}
