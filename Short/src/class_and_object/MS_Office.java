package class_and_object;

public class MS_Office {

    //data member
    String released_year;
    int version;

    /*TODO //SYNTAX : access_specifier return_type method_name (parameter) {CODE}
    //access specifier -> public,private,protected,default  THEORY PART
    //return type -> output of function or method: void : no return type
    //method name -> can be anything, it should be meaningful
    //parameter -> input parameter : optional*/

    //capabilities
    //store_information
    public void store_information(){
        System.out.println("This is store_information method");
    }
    //save_information
    public void save_information(){
        System.out.println("This is save_information method");
    }

    public static void main(String[] args) {
        MS_Office obj=new MS_Office();

        //how to call or execute method?
        //objectname.methodname();

        obj.store_information();
        obj.save_information();
    }
}
