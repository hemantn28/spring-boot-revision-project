package class_and_object;

public class Inverter {
    //data member
    String company_name;
    double price;

    /*TODO //SYNTAX : access_specifier return_type method_name (parameter) {CODE}
    //access specifier -> public,private,protected,default  THEORY PART
    //return type -> output of function or method: void : no return type
    //method name -> can be anything, it should be meaningful
    //parameter -> input parameter : optional*/

    //capabilities
    //store_electricity
    public void store_electricity(){
        System.out.println("This is store_electricity method");
    }
    //supply_electricity
    public void supply_electricity(){
        System.out.println("This is supply_electricity method");
    }

    public static void main(String[] args) {
        Inverter obj=new Inverter();

        //how to call or execute method?
        //objectname.methodname();

        obj.store_electricity();
        obj.supply_electricity();
    }
}
