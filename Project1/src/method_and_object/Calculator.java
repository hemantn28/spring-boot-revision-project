package method_and_object;

public class Calculator {
    //addition
        //syntax: access_specifier return_type method_name(parameter){CODE}
    public void addition(){
        int a=10;
        int b=8;
         int sum=a+b;
        System.out.println("sum is "+sum);
    }
    //subtraction
    //syntax: access_specifier return type method name(parameter){}
    public void subtraction(){
        int c=10;
        int d=5;
        int subtraction =c-d;
        System.out.println("subtraction is "+subtraction);
    }
    //multiplication
    //syntax:access_specifier return type method name(parameter){CODE}
    public void multiplication(){
        int e=3;
        int f=4;
        int multiplication=e*f;
        System.out.println("multiplication is "+multiplication);
    }
    //division
    //syntax:access specifier return type method name(parameter){CODE}
    public void division(){
        int g=4;
        int h=2;
        int division=g/h;
        System.out.println("division is "+division);
    }
    public static void main(String[] args) {
        Calculator obj=new Calculator();
        obj.addition();
        obj.subtraction();
        obj.multiplication();
        obj.division();
    }


}
