package class_and_object;

public class Computer {

    //datamember

    String type;
    double price;

    /*TODO //SYNTAX : access_specifier return_type method_name (parameter) {CODE}
    //access specifier -> public,private,protected,default  THEORY PART
    //return type -> output of function or method: void : no return type
    //method name -> can be anything, it should be meaningful
    //parameter -> input parameter : optional*/

    //capabilities
    //play_movies
    public void play_movies(){
        System.out.println("This is play_movies method");
    }

    //calculate
    public void calculate(){
        System.out.println("This is calculate method");
    }

    public static void main(String[] args) {
        Computer obj=new Computer();

        //how to call or execute method?
        //objectname.method name

        obj.play_movies();
        obj.calculate();

    }
}
