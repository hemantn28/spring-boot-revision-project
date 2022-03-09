package class_and_object;

public class Fish {

    //data member

    String breed;
    int weight;

    /*TODO //SYNTAX : access_specifier return_type method_name (parameter) {CODE}
    //access specifier -> public,private,protected,default  THEORY PART
    //return type -> output of function or method: void : no return type
    //method name -> can be anything, it should be meaningful
    //parameter -> input parameter : optional*/

    //capabilities
    //swim
    public void swim(){
        System.out.println("This is swim method");
    }

    //hunt
    public void hunt(){
        System.out.println("This is hunt method");
    }

    public static void main(String[] args) {
        Fish obj=new Fish();

        //how to call or execute method?
        //objectname.methodname();

        obj.swim();
        obj.hunt();
    }
}
