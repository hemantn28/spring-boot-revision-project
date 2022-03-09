package methods;

public class Khatabook {
    //subtraction
    //access_simplifier return_type method_name(parameter){CODE}
    public void subtraction(){
        int a=19;
        int b=10;
        int result=a-b;
        System.out.println("subtraction is "+result);
    }
    //addition
    //access_simplifier return_type method_type(parameter){CODE]
    public void addition(){
        int c=56;
        int d=47;
        int result=c+d;
        System.out.println("Addition is "+result);
    }
    //division
    //access_simplifier return_type method_name(parameter){CODE}
    public void division(){
        int f=110;
        int r=11;
        int result=f/r;
        System.out.println("division is "+result);
    }
    //multiplication
    //syntax: access_simplifier return_type method_name(parameter){CODE}
    public void multiplication(){
        int s=65;
        int w=75;
        int result=s*w;
        System.out.println("multiplication is "+result);
    }


    public static void main(String[] args) {
        Khatabook obj=new Khatabook();
        obj.subtraction();
        obj.addition();
        obj.division();
        obj.multiplication();
    }
}
