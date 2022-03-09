package class_object;

public class Animal {

    //data member

    String breed;
    int weight;

    /*TODO SYNTAX : access_specifier return_type method_name (parameter) {CODE}
    //access specifier -> public,private,protected,default  THEORY PART
    //return type -> output of function or method: void : no return type
    //method name -> can be anything, it should be meaningful
    //parameter -> input parameter : optional*/



    //capabilities
    //eat

    public void eat (){
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
        Animal obj=new Animal();

        //how to call/execute method?
        //objname.Methodname();
        obj.eat();
        obj.run();
        obj.play();
    }





}
