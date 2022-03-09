package methods;

public class Calculator {

    //addition
    //SYNTAX: access_specifier return_type method_name (parameter){CODE}

    public void addition(){
        int a=10;
        int b=8;

        int result=a+b;


        System.out.println("Addition is "+result);
    }
    //subtraction
    // SYNTAX: access_specifier return_type method_name (parameter){CODE}

    public void subtraction(){
        int a=65;
        int b=112;
        int result=b-a;

        System.out.println("Subtraction is "+result);
    }
    //division
    //SYNTAX: access_specifier return_type method_name(Parameter){CODE}

    public void division(){
        int a=50;
        int b=5;
        int result=a/b;

        System.out.println("Division is "+result);
    }
    //multiplication
    //SYNTAX: access_specifier return_type method_name(parameter){CODE}

    public void multiplication(){
        int a=5;
        int b=6;
        int result=a*b;

        System.out.println("multiplication is "+result);
    }


    public static void main(String[] args) {
        Calculator obj=new Calculator();
        obj.addition();
        obj.subtraction();
        obj.division();
        obj.multiplication();
    }
       }



