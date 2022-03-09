package class_and_objects;

public class Animal {
    //data member

    String breed;
    int weight;
    /* syntax: access_specifier return_type method_name (parameter){CODE}
               access_specifier-->public,private,protected,default, THEORY PART
               return type--> output of function or method: void: no return type
               method name--> can be anything: it should be meaningful
               parameter-->input parameter: optional*/

    //capabilities
    //eat
    public void eat(){
        System.out.println("this is eat method....");
    }
    //run
    public void run(){
        System.out.println("this is run method....");
    }
    //play
    public void play(){
        System.out.println("this is play method");
    }

    public static void main(String[] args) {
        //create object
        //ClassName obj_name=new Classname();
        Animal obj=new Animal();
        //How to call or execute methods?
        //objName.Method_name
        obj.eat();
        obj.run();
        obj.play();
    }

}
