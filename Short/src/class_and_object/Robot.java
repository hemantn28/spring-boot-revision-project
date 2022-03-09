package class_and_object;

public class Robot {

    //datatype

    String company_name;
    int weight;

    /*TODO //SYNTAX : access_specifier return_type method_name (parameter) {CODE}
    //access specifier -> public,private,protected,default  THEORY PART
    //return type -> output of function or method: void : no return type
    //method name -> can be anything, it should be meaningful
    //parameter -> input parameter : optional*/

    //capabilities

    //multitasking
    public void multitasking(){
        System.out.println("This is multitasking method");
    }

    public static void main(String[] args) {
        Robot obj=new Robot();

        //how to call or execute method?
        //objectname.methodname();

        obj.multitasking();

    }
}
