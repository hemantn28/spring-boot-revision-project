package monday_21_3_2022;

class Cat implements AnimalStuff{

    public void makeNoise() {
        System.out.println("meow");
    }

    @Override
    public void poop() {
        System.out.println("phlbblobpblbop");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Cat myCat=new Cat();
        myCat.makeNoise();

    }
}
