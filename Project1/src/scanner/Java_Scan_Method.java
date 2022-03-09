package scanner;

import java.util.Scanner;

public class Java_Scan_Method {
    public void add(int a,int b){
        int result=a+b;
        System.out.println("add is "+result);
    }
    public void minus(int a,int b){
        int result=a-b;
        System.out.println("minus is "+result);
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
        Java_Scan_Method get=new Java_Scan_Method();
        Scanner obj=new Scanner(System.in);
        System.out.println("Welcome to calculator app Please enter your choice "+
                           " 1 for addition,2 for minus,3 for multiply,4 for divide" );
        int choice= obj.nextInt();
        System.out.println("enter value of a");
        int a= obj.nextInt();
        System.out.println("enter value of b");
        int b= obj.nextInt();

        if(choice==1){
            get.add(a,b);
        }
        else if(choice==2){
            get.minus(a,b);
        }
        else if(choice==3){
            get.multiply(a,b);
        }
        else if(choice==4){
            get.divide(a,b);
        }
    }
}
