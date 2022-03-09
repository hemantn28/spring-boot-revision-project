package scanner;

import java.util.Scanner;

public class Scanner_While_Loop {
    public void addition(int a,int b){
        int result=a+b;
        System.out.println("addition is "+result);
    }
    public void subtraction(int a,int b){
        int result=a-b;
        System.out.println("subtraction is "+result);
    }
    public void multiply(int a,int b){
        int result=a*b;
        System.out.println("multiply is"+result);
    }
    public void divide(int a, int b){
        int result=a/b;
        System.out.println("divide is "+result);
    }

    public static void main(String[] args) {
        Scanner_While_Loop any=new Scanner_While_Loop();
        Scanner obj=new Scanner(System.in);
        System.out.println("Welcome to calculator app Please enter your choice "+
                            "1 for addition, 2 for subtraction,3 for multiply, 4 for divide");
        int choice= obj.nextInt();

        while(choice!=0){

            System.out.println("enter value of a");
            int a= obj.nextInt();
            System.out.println("enter value of b");
            int b= obj.nextInt();

            if(choice==1){
                any.addition(a,b);
            }
            else if(choice==2){
                any.subtraction(a,b);
            }
            else if(choice==3){
                any.multiply(a,b);
            }
            else if(choice==4){
                any.divide(a,b);
            }
            System.out.println("Enter 0 to exit from calculator ");
            choice= obj.nextInt();
        }
    }
}
