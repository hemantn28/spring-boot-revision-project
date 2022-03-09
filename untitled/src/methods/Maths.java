package methods;

public class Maths {

    //subtraction
    //SYNTAX: access_simplifier return_type method_name(parameter){CODE}

    public void subtraction(){
        int a=8;
        int b=7;
        int result=a-b;

        System.out.println("Subtraction is "+result);
    }
    //division
    //SYNTAX: access_simplifier return_type method_name(parameter){CODE}

    public void division(){
        int a=8;
        int b=2;
        int result=a/b;

        System.out.println("Division is "+result);
    }

    //addition
    //SYNTAX: access_simplifier return_type method_name(parameter){CODE}

    public void addition(){

        int a=5;
        int b=6;
        int result=a+b;

        System.out.println("Addition is "+result);
    }

    //multiplication
    //SYNTAX: access_simplifier return_type method_name (parameter){CODE}

    public void multiplication(){
        int a=5;
        int b=4;
        int result=a*b;
        System.out.println("Multiplication is "+result);
    }
    public static void main(String[] args) {
        Maths obj=new Maths();
        obj.subtraction();
        obj.division();
        obj.addition();
        obj.multiplication();
    }

}
