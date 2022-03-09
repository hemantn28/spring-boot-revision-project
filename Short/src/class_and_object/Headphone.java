package class_and_object;

public class Headphone {

    //datatype

    String company_name;
    int price;

    /*TODO //SYNTAX : access_specifier return_type method_name (parameter) {CODE}
    //access specifier -> public,private,protected,default  THEORY PART
    //return type -> output of function or method: void : no return type
    //method name -> can be anything, it should be meaningful
    //parameter -> input parameter : optional*/

    //capabilities
    //listen
    public void listen(){
        System.out.println("This is listen method");
    }
    //talk
    public void talk(){
        System.out.println("This is talk meyhod");
    }

    public static void main(String[] args) {
        Headphone obj=new Headphone();

        //how to call or execute method?
        //objectname.methodname

        obj.listen();
        obj.talk();
    }
}
