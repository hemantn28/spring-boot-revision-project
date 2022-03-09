package class_and_object;

public class Lion {

    //data member

    String breed;
    int weight;

    /*TODO //SYNTAX : access_specifier return_type method_name (parameter) {CODE}
    //access specifier -> public,private,protected,default  THEORY PART
    //return type -> output of function or method: void : no return type
    //method name -> can be anything, it should be meaningful
    //parameter -> input parameter : optional*/

    //capabilities
    //prey
    public void prey(){
        System.out.println("This is prey method");
    }

    //run
    public void run(){
        System.out.println("This is run method");
    }

    public static void main(String[] args) {
        Lion obj=new Lion();

        //how to call or execute method?
        //objname.methodname();

        obj.prey();
        obj.run();
    }
}
