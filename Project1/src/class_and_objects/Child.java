package class_and_objects;

public class Child {
    //syntax:access_specifier return_type method_name(parameter){CODE}

    //capabilities
    //make noise
    public void makenoise(){
        System.out.println("This is make noise method");
    }
    //play
    public void play(){
        System.out.println("this is play method");
    }

    public static void main(String[] args) {
        //create object
        //Classname objname=new classname();
        Child obj=new Child();
        //how to call oe execute method?
        //objname.methodname();
        obj.makenoise();
        obj.play();
    }
}
