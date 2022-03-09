package methods;

public class Mathematics {

    //addition
    //syntax: access_simplifier return_type method_name(parameter){Code}

    public void addition(){
        int a=45;
        int b=65;
        int result=a+b;
        System.out.println("Addition is "+result);
    }
    //subtraction
    //sytax: access_simplifier return_type method_name(parameter){CODE}

    public void subtraction(){
        int a=789;
        int b=456;
        int result=a-b;
        System.out.println("Subtraction is "+result);
    }
    //multiplication
    //syntax: access_simplifier return_type method_name(parameter){CODE}

    public void multiplication(){
        int a=85;
        int b=69;
        int result=a*b;
        System.out.println("Multiplication is "+result);
    }
    //division
    //access_simplifier return_type method_name(parameter){CODE}

    public void division(){
        int a=100;
        int b=10;
        int result=a/b;
        System.out.println("Division is "+result);
    }



    public static void main(String[] args) {
        Mathematics obj=new Mathematics();
        obj.addition();
        obj.subtraction();
        obj.multiplication();
        obj.division();
    }
}
