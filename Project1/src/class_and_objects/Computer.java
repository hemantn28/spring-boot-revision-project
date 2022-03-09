package class_and_objects;

public class Computer {
    //data member
    String name;
    int price;
    //syntax: access_specifier return type method name(parameter){CODE}

    //capabilities

    //calculate
    public  void calculate(){
        System.out.println("this is calculate method");
    }
    //play videos
    public void playvideos(){
        System.out.println("this is playvideos method");
    }

    public static void main(String[] args) {
        //create object
        //Classname objname= new Classname();
        Computer obj=new Computer();
        //how to call/execute method?
        obj.calculate();
        obj.playvideos();
    }
}
