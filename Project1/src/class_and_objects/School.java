package class_and_objects;

public class School {
    //data member
    String name;
    int age;

    //syntax: access_specifier return type methodname(parameter){CODE}

    //capabilities

    //study
    public void study(){
        System.out.println("this is study method");
    }
    //play
    public void play(){
        System.out.println("this is play method");
    }

    public static void main(String[] args) {
        //create object
        //Classname objname=new Classname();
        School obj=new School();
        //how to call or execute method
        //objname.merhodname();
        obj.study();
        obj.play();
    }
}
