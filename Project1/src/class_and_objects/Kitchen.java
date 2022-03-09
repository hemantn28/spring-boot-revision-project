package class_and_objects;

public class Kitchen {
    //syntax: access_specifier return_type method_name(parameter){CODE}

    //CAPABILITIES
    //cookfood
    public void cookfood(){
        System.out.println("this is cookfood method");
    }
    //tea
    public void tea(){
        System.out.println("thsi is tea method");
    }

    public static void main(String[] args) {
        //create object
        //Classname objname=new Classname();
        Kitchen obj=new Kitchen();
        //call or execute method
        //objname.methodname();
        obj.cookfood();
        obj.tea();
    }
}
