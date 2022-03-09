package class_and_object;

public class Bike {

    //data member
    String model;
    double price;


    /*TODO //SYNTAX : access_specifier return_type method_name (parameter) {CODE}
    //access specifier -> public,private,protected,default  THEORY PART
    //return type -> output of function or method: void : no return type
    //method name -> can be anything, it should be meaningful
    //parameter -> input parameter : optional*/

    //capabilities

    //run
    public void run(){
        System.out.println("This is run method");
    }

    //drive
    public void drive(){
        System.out.println("This is drive method");
    }

    public static void main(String[] args) {
        Bike obj=new Bike();

        //how to call or execute method?
        //objectname.methodname

        obj.run();
        obj.drive();
    }
}
