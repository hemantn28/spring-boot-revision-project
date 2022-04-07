package saturday_2_4_2022;

public class Cat extends Animal8{
    public void eat(){
        System.out.println("meow meow");
    }

    public static void main(String[] args) {
        Cat myCat=new Cat();
        myCat.eat();
    }
}
