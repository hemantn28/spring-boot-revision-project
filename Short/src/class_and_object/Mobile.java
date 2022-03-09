package class_and_object;

public class Mobile {

    //data member

    String type;
    String company;

    /*TODO //SYNTAX : access_specifier return_type method_name (parameter) {CODE}
    //access specifier -> public,private,protected,default  THEORY PART
    //return type -> output of function or method: void : no return type
    //method name -> can be anything, it should be meaningful
    //parameter -> input parameter : optional*/

    //capabilities
    //call
    public void call(){
        System.out.println("This is call method");
    }

    //calculate
    public void calculate(){
        System.out.println("This is calculate method");
    }

    public static void main(String[] args) {
        Mobile obj=new Mobile();

        //how to call or execute method?
        //objname.methodname();

        obj.call();
        obj.calculate();
    }

}
