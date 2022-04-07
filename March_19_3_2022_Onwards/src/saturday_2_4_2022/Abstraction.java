package saturday_2_4_2022;

abstract class Animalia {

    Animalia(){
        System.out.println("U r creating a new animalia");
    }
    abstract void walk();

    public void eat(){
        System.out.println("animal eats");
    }
}

    class Camel extends Animalia {
    Camel(){
        System.out.println("created a new camel");
    }
        public void walk() {
            System.out.println("walks on 4 legs");
        }
    }

    class Ostrich extends Animalia {
        public void walk() {
            System.out.println("walks on 2 legs");
        }
    }

    public class Abstraction {
        public static void main(String[] args) {
            Camel myCamel = new Camel();
            myCamel.walk();
            myCamel.eat();
        }
    }

