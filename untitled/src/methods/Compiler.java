package methods;

public class Compiler {
    //division
    //syntax: access_simplifier return_type method_name(parameter){CODE}
    public void division(){
        int a=11;
        int b=2;
        int result=a/b;
        System.out.println("Division is "+result);
    }
    //addition
    //syntax: access_simplifier return_type method_name(parameter){CODE}
    public void addition(){
        int a=10;
        int b=5;
        int result=a+b;
        System.out.println("addition is "+result);
    }
    //multiplication
    //access_simplifier return_type method_name(parameter){CODE}
    public void multiplication(){
        int a=14;
        int b=10;
        int result=a*b;
        System.out.println("multiplication is "+result);
    }
    //subtraction
    //access_simplifier return_type method_name(parameter){CODE}
    public void subtraction(){
        int a=87;
        int b=14;
        int result=a-b;
        System.out.println("subtraction is "+result);
    }

    public static void main(String[] args) {
        Compiler obj=new Compiler();
        obj.division();
        obj.addition();
        obj.multiplication();
        obj.subtraction();
    }

}
