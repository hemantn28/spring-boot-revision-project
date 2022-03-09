package methodswithinput;

public class Input_Calc {
    //multiplication
    //syntax: access_simplifier return_type method_name(input parameter){CODE}

    public void multiplication(int a,int b){
        int result=a*b;
        System.out.println("multiplication is "+result);
    }
    public void division(int a,int b){
        int result=a/b;
        System.out.println("division is "+ result);
    }
    public void addition(int a, int b){
        int result=a+b;
        System.out.println("addition is "+result);
    }
    public void subtraction(int a,int b){
        int result=a-b;
        System.out.println("subtraction is "+result);
    }

    public static void main(String[] args) {
        Input_Calc obj=new Input_Calc();
        obj.multiplication(10,5);
        obj.division(10,2);
        obj.addition(5,21);
        obj.subtraction(5,2);
    }

}
