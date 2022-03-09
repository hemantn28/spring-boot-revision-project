package class_and_object;

public class Animals {

    //data member

    String breed;
    int weight;
    
    /*TODO //SYNTAX : access_specifier return_type method_name (parameter) {code}
    //access_specifier->public,private,protected,default Theory part
    //return type->output of function or method : void : no return type
    //method name->can be anything: it should be meaningful
    //parameter->input parameter : optional */
    
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
        Animals obj=new Animals();

        //How to call or execute method?
        //objname.methodname();
        obj.eat();
        obj.run();
        obj.play();



    }
}
