package class_and_object;

public class Children {

    //data member

    String name;
    int age;

    /*TODO //SYNTAX : access_specifier return_type method_name (parameter) {CODE}
    //access specifier -> public,private,protected,default  THEORY PART
    //return type -> output of function or method: void : no return type
    //method name -> can be anything, it should be meaningful
    //parameter -> input parameter : optional*/

    //capabilities

    //talk
    public void talk(){
        System.out.println("This is talk method");
    }

    //walk
    public void walk(){
        System.out.println("This is walk method");
    }

    public static void main(String[] args) {
        Children obj=new Children();

        //how to call oe execute method?
        //objname.methodname();

        obj.talk();
        obj.walk();


        }
    }


