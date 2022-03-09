package method_and_object;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Calculator2 {
    //addition
    //syntax:access_specifier return_type method_name(parameter){CODE}
    public void addition(){
        int a=1;
        int b=2;
        int addition=a+b;
        System.out.println("addition is "+addition);
    }
    //subtraction
    //syntax:access_specifer return type method name(parameter){CODE}
    public void subtraction(){
        int aa=3;
        int bb=2;
        int subtraction=aa-bb;
        System.out.println("subtraction is "+subtraction);
    }
    //multiplication
    //syntax: access specifier return type method name(parameter){CODE}
    public void multiplication(){
        int aaa=4;
        int bbb=5;
        int multiplication=aaa*bbb;
        System.out.println("multiplication is "+multiplication);
    }
    //division
    //syntax: access simplifier return type method name(parameter){CODE}
    public void division(){
        int aaaa=6;
        int bbbb=3;
        int division=aaaa/bbbb;
        System.out.println("division is "+division);
    }



    public static void main(String[] args) {
        Calculator2 obj=new Calculator2();
        obj.addition();
        obj.subtraction();
        obj.multiplication();
        obj.division();
    }
}
