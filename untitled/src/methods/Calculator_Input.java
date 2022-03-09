package methods;

public class Calculator_Input {
    //addition
    //syntax: access_simplifier return_type method_name(input parameter){CODE}

    public void addition(int a,int b){

        int result=a+b;
        System.out.println("Addition is: "+result);
    }
    //subtraction
    public void subtraction(int a,int b){
        int result=a-b;
        System.out.println("Subtraction is "+result);
    }

    public static void main(String[] args) {
        Calculator_Input obj=new Calculator_Input();
        obj.addition(15,61);
        obj.subtraction(85,55);

    }

}
