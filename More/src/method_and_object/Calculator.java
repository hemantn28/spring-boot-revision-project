package method_and_object;

public class Calculator {
    //addition
    // syntax: access_specifier return_type method_name(parameter){CODE}

    public void addition(){
        int a=1;
        int b=2;
        int sum=a+b;

        System.out.println("addition is "+sum);
    }
    //subtraction
    public void Subtraction(){
    int c=3;
    int d=4;
    int subtraction=d-c;
        System.out.println("subtraction is "+subtraction);
    }
    //multiply
    public void multiply(){
        int e=5;
        int f=6;
        int multiply=e*f;

        System.out.println("multiply is "+multiply);
    }
    //division
    public void division(){
        int g=8;
        int h=4;
        int division=g/h;
        System.out.println("division is "+division);

    }

    public static void main(String[] args) {
        Calculator obj=new Calculator();
        obj.addition();
        obj.Subtraction();
        obj.multiply();
        obj.division();
    }


}
