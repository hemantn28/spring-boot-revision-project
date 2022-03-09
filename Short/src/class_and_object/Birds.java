package class_and_object;

public class Birds {

    //data member

    String breed;
    int weight;

    /*TODO //SYNTAX : access_specifier return_type method_name (parameter) {CODE}
    //access specifier -> public,private,protected,default  THEORY PART
    //return type -> output of function or method: void : no return type
    //method name -> can be anything, it should be meaningful
    //parameter -> input parameter : optional*/

    //capabilities
    //fly

    public void fly(){
        System.out.println("This is fly method");
    }

    //drink
    public void drink(){
        System.out.println("This is drink method");
    }

    public static void main(String[] args) {
        Birds obj=new Birds();

        //how to call oe execute method?
        //objname.methodname();

        obj.fly();
        obj.drink();


    }
}
