package class_and_objects;

public class Books {
    //data member
    String name;
    int pages;
    //syntax: access_specifier return type method name(parameter){CODE}

    //CAPABILITIES
    //read
    public void read(){
        System.out.println("this is read method");
    }
    //study
    public void study(){
        System.out.println("this is study method");
    }

    public static void main(String[] args) {
        //create object
        //Classname objname=new Classname();
        Books obj=new Books();
        //how to call or execute method?
        //objname.methodname();
        obj.read();
        obj.study();
    }
}
