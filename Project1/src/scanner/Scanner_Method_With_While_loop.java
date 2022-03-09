package scanner;

import java.util.Scanner;

public class Scanner_Method_With_While_loop {
    public void add(int a,int b){
        int result=a+b;
        System.out.println("add is "+result);
    }
    public void subtract(int a, int b){
        int result=a-b;
        System.out.println("subtract is "+result);
    }
    public void multiply(int a, int b){
        int result=a*b;
        System.out.println("multiply is"+result);
    }
    public void divide(int a, int b){
        int result=a/b;
        System.out.println("divide is "+result);
    }

    public static void main(String[] args) {
        Scanner_Method_With_While_loop lay=new Scanner_Method_With_While_loop();
        Scanner obj=new Scanner(System.in);
        System.out.println("Welcome to calculator app Please enter your choice "+
                            "1 for add, 2 for subtract, 3 for multiply, 4 for divide");
        int choice= obj.nextInt();

        while(choice!=0){

            System.out.println("Please enter value of a");
            int a= obj.nextInt();
            System.out.println("enter value of b");
            int b= obj.nextInt();

            if(choice==1){
                lay.add(a,b);
            }
            else if(choice==2){
                lay.subtract(a,b);
            }
            else if(choice==3){
                lay.multiply(a,b);
            }
            else if(choice==4){
                lay.divide(a,b);
            }
            System.out.println("Please enter 0 to exit from calculator");
            choice= obj.nextInt();


        }
    }

}
