package scanner;

import java.util.Scanner;

public class Scanner_WhileLoop {
    public void addition(int a, int b){
        int result=a+b;
        System.out.println("addition is "+result);
    }
    public void subtraction(int a,int b){
        int result=a-b;
        System.out.println("subtraction is"+result);
    }
    public void multiply(int a, int b){
        int result=a*b;
        System.out.println("multiply is "+result);
    }
    public void divide(int a,int b){
        int result=a/b;
        System.out.println("divide is "+result);
    }

    public static void main(String[] args) {
        Scanner_WhileLoop home=new Scanner_WhileLoop();
        Scanner obj=new Scanner(System.in);
        System.out.println("Welcome to calcu;tor app Please enter your preference "+
                            "1 for addition, 2 for subtraction, 3 for multiply, 4 for divide");
        int preference= obj.nextInt();

        while(preference!=0){
            System.out.println("enter value of a");
            int a= obj.nextInt();
            System.out.println("enter value of b");
            int b= obj.nextInt();

            if(preference==1){
                home.addition(a,b);
            }
            else if(preference==2){
                home.subtraction(a,b);
            }
            else if (preference==3){
                home.multiply(a,b);
            }
            else if(preference==4){
                home.divide(a,b);
            }
            System.out.println("enter 0 to exit from calcultor");
            preference= obj.nextInt();
        }
    }
}
