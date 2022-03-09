package methods;

public class Ganit {
    //multiplication
    //syntax: access_simplifier return_type method_name(parameter){CODE}
    public void multiplication(){
        int o=962543611;
        int b=456321789;
        int result=o*b;
        System.out.println("multiplication is "+result);
    }
    //addition
    //syntax: access_simplifier return_type method_name(parameter){CODE}
    public void addition(){
        int x=84;
        int n=74;
        int result=x*n;
        System.out.println("Addition is "+result);
    }
    //subtraction
    //syntax: access_simplifier return_type method_name(parameter){CODE}
    public void subtraction(){
        int c=56;
        int b=46;
        int result=c-b;
        System.out.println("subtraction is "+result);
    }
    //division
    //syntax: access_simplifier return_type method_name(parameter){CODE}
    public void division(){
        int f=220;
        int m=10;
        int result=f/m;
        System.out.println("division is "+result);
    }

    public static void main(String[] args) {
        Ganit uid=new Ganit();
        uid.multiplication();
        uid.addition();
        uid.subtraction();
        uid.division();
    }
}
