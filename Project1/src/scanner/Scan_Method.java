package scanner;

import java.util.Scanner;

public class Scan_Method {
    public void addition(int a,int b){
        int result=a+b;
        System.out.println("addition is "+result);
    }
    public void subtraction(int a, int b){
        int result=a-b;
        System.out.println("subtraction is "+result);
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
        Scan_Method boy=new Scan_Method();
        Scanner obj=new Scanner(System.in);
        System.out.println(" Welcome to calculator app Please enter your choice : " +
                           "1 for addition,2 for subtraction,3 for multiply, 4 for divide ");
        int choice=obj.nextInt();
        System.out.println("Enter value of a");
        int a= obj.nextInt();
        System.out.println("enter value of b");
        int b= obj.nextInt();

        if(choice==1){
            boy.addition(a,b);
        }
        else if(choice==2){
            boy.subtraction(a,b);
        }
        else if(choice==3){
            boy.multiply(a,b);
        }
        else if(choice==4){
            boy.divide(a,b);
        }
    }
}
