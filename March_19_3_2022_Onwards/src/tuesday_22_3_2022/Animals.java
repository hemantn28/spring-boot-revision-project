package tuesday_22_3_2022;

public abstract class Animals {
    int age;
    String name;

    public abstract void makeNoise();

    public void printName(){
        System.out.println("My name is "+name);
    }
}
