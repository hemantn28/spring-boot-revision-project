package class_and_object;

public class AC {

    //data member
    String company_name;
    double price;


    /*TODO //SYNTAX : access_specifier return_type method_name (parameter) {CODE}
    //access specifier -> public,private,protected,default  THEORY PART
    //return type -> output of function or method: void : no return type
    //method name -> can be anything, it should be meaningful
    //parameter -> input parameter : optional*/

    //capabilities

    //cool
    public void cool(){
        System.out.println("This is cool method");
    }

    //heat
    public void heat(){
        System.out.println("This is heat method");
    }

    public static void main(String[] args) {
        AC obj=new AC();

        //how to call or execute method?
        //objectname.methodname();

        obj.cool();
        obj.heat();

    }


}
