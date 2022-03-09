package object;

public class Animal {
    //data member

    String breed;
    int weight;
    //TODO SYNTAX: access_specifier return_type method_name(parameter){CODE}

    //capabilities

    //eat
    public void eat(){
        System.out.println("This is eat method");
    }

    //run
    public void run(){
        System.out.println("This is run method");
    }
    //play
    public void play(){
        System.out.println("This is play method");
    }

    public static void main(String[] args) {
        Animal pan=new Animal();

        //how to call or execute method?
        //objectname.methodname();
        pan.eat();
        pan.run();
        pan.play();
    }

}
