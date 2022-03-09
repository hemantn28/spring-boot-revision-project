package class_and_object;

public class Dog {

    //datamember

    String breed;
    int weight;

    /*TODO //SYNTAX : access_specifier return_type method_name (parameter) {CODE}
    //access specifier -> public,private,protected,default  THEORY PART
    //return type -> output of function or method: void : no return type
    //method name -> can be anything, it should be meaningful
    //parameter -> input parameter : optional*/

    //capabilities

    //bark
    public void bark(){
        System.out.println("This is bark method");
    }

    //bite
    public void bite(){
        System.out.println("This is bite method");
    }

    public static void main(String[] args) {
        Dog obj=new Dog();

        //how to call or execute method?
        //objectname.methodname();

        obj.bark();
        obj.bite();


    }
}
