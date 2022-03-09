package class_and_objects;

public class Java {
    //datamember
    String name;
    int version;

    //syntax: access_specifer return type method name(parameter){CODE}
    //capabilities
    //code
    public void code(){
        System.out.println("this is code method");
    }
    //makesoftwsres
    public void makesoftwares(){
        System.out.println("this is makesoftwares method");
    }

    public static void main(String[] args) {
        //create object
        //Classname objname=new Classname();
        Java obj=new Java();
        //how to call/execute method
        //objname.methodname
        obj.code();
        obj.makesoftwares();
    }
}
