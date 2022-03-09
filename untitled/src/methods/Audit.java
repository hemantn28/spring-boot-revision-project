package methods;

public class Audit {
    //subtraction
    //syntax: access_simplifier return_type method_name(parameter){CODE}
    public void subtracton(){
        int t=82;
        int i=10;
        int result=t-i;
        System.out.println("subtraction is "+result);
    }
    //addition
    //syntax: access_simplifier return_type method_name(parameter){CODE}

    public void addition(){
        int q=10;
        int z=10;
        int result=q+z;
        System.out.println("Addition is "+result);
    }
    //multiplication
    //syntax: access_simplifier return_type method name(parameter){CODE}
    public void multiplication(){
        int g=41;
        int y=45;
        int result=g*y;
        System.out.println("Multiplication is "+result);
    }
    //division
    //syntax: access_simplifier return_type method_name(parameter){CODE}
    public void division(){
        int u=70;
        int k=10;
        int result=u/k;
        System.out.println("Division is "+result);
    }


    public static void main(String[] args) {
        Audit std=new Audit();
        std.subtracton();
        std.addition();
        std.multiplication();
        std.division();
    }
}
