package object;

public class Horse {
    //data member
    String breed;
    int weight;
    //todo syntax: access_specifier return_type method_name(parameter){CODE}

    //capabilities
    //run
    public void run(){
        System.out.println("This is run method");
    }
    //eat
    public void eat(){
        System.out.println("This is eat method");
    }

    public static void main(String[] args) {
        Horse sub=new Horse();
        //how to call or execute method?
        //objectname.methodname
        sub.run();
        sub.eat();
    }

}
