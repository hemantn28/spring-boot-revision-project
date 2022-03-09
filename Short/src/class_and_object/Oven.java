package class_and_object;

public class Oven {

    //data member
    String company_name;
    double price;

    /*TODO //SYNTAX : access_specifier return_type method_name (parameter) {CODE}
    //access specifier -> public,private,protected,default  THEORY PART
    //return type -> output of function or method: void : no return type
    //method name -> can be anything, it should be meaningful
    //parameter -> input parameter : optional*/

    //capabilities
    //cook
    public void cook(){
        System.out.println("This is cook method");
    }
    //heat
    public void heat(){
        System.out.println("Thsi is heat method");
    }

    public static void main(String[] args) {
        Oven obj=new Oven();

        //how to call or execute method?
        //objectname.methodname

        obj.cook();
        obj.heat();
    }
}
