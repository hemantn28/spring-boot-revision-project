package oops_19_3_2022;

class Animal{
    String name;
    int weight;
    float age;

    public void hunt(){
        System.out.println("this animal can hunt");
    }
    public void run(){
        System.out.println("this animal can run");
    }
    public void eat(){
        System.out.println("this animal can eat");
    }
    public void getName(){
        System.out.println(this.name);
    }
    public void getWeight(){
        System.out.println(this.weight);
    }
}
class Book{
    String name;
    String author;
    float price;
    int pages;

    public void read(){
        System.out.println("We can read book");
    }
    public void write(){
        System.out.println("We can write book");
    }
}

public class MethodCalling {
    public static void main(String[] args) {
        Animal am1=new Animal();
        am1.hunt();
        am1.run();
        am1.eat();
        am1.name="Lion";
        am1.weight=200;
        am1.getName();
        am1.getWeight();
        am1.age=10.5f;
        System.out.println(am1.age);

        Book bk1=new Book();
        bk1.name="Copycat Marketing";
        bk1.author="Burke hedges";
        bk1.price=105.50f;
        bk1.pages=60;
        System.out.println(bk1.name);
        System.out.println(bk1.author);
        System.out.println(bk1.price);
        System.out.println(bk1.pages);

        Book bk2=new Book();
        bk2.name="Magic of thinking big";
        bk2.author="DAvid Schwartz";
        bk2.price=165.50f;
        bk2.pages=127;

        System.out.println(bk2.name);
        System.out.println(bk2.author);
        System.out.println(bk2.price);
        System.out.println(bk2.pages);


    }
}
