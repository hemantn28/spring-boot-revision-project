package methodswithinput;

import java.util.Scanner;

public class CalcWIthInput {
    //syntax: access_simplifier return_type method_name(input parameter){CODE}

    public void addition(int a,int b){
        int result=a+b;
        System.out.println("addition is "+result);
    }
    //syntax: access_simplifier return_type method_name(input parameter){CODE}
    public void subtraction(int a, int b){
        int result=a-b;
        System.out.println("subtraction is "+result);
    }
    public void multiply(int a, int b){
        int result=a*b;
        System.out.println("multiply is "+result);
    }
    public void divide(int a, int b){
        int result=a/b;
        System.out.println("divide is "+result);
    }

    public static void main(String[] args) {
        CalcWIthInput obj=new CalcWIthInput();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to calculator app Please enter your coice: " +
                        "1 for addition,2 for subtraction, 3 for multiply,4 for divide");
        int choice= scanner.nextInt();
        System.out.println("Please enter value of a: ");
        int a=scanner.nextInt();
        System.out.println("Plaese enter value of b: ");
        int b=scanner.nextInt();

        if(choice==1){
            obj.addition(a,b);
        }
        else if(choice==2){
            obj.subtraction(a,b);
        }
        else if(choice==3){
            obj.multiply(a,b);
        }
        else if(choice==4){
        }   obj.divide(a,b);



    }
}
