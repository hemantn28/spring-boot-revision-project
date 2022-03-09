package method_and_object;

public class Calculator1 {
    //addition
    //syntax: access_specifier return type method name(parameter){CODE}

    public void addition(){
        int a=1;
        int b=2;
        int sum=a+b;
        System.out.println("sum is "+sum);
    }
    //subtraction
    //syntax: access_specifier return type method name(){CODE}
    public void subtraction(){
        int c=5;
        int d=3;
        int subtraction=c-d;
        System.out.println("subtraction is "+subtraction);
    }
    //multiplication
    //syntax:access_specifier return type methodname(){}
    public void multiplication(){
        int e=5;
        int f=6;
        int multiplication=e*f;
        System.out.println("multiplication is "+multiplication);
    }
    //division
    //syntax:access_specifier return type method name(){}
    public void division(){
        int g=10;
        int h=5;
        int division=g/h;
        System.out.println("division is "+division);
    }

    public static void main(String[] args) {
        Calculator1 obj=new Calculator1();
        obj.addition();
        obj.subtraction();
        obj.multiplication();
        obj.division();
    }
}
