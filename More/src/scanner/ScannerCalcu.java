package scanner;

import java.util.Scanner;

public class ScannerCalcu {
    public void multiply(int a, int b){
        int multiply=a*b;
        System.out.println("multiply is "+multiply);
    }
    public void addition(int a, int b){
        int addition=a+b;
        System.out.println("addition is "+addition);
    }

    public static void main(String[] args) {
        ScannerCalcu obj=new ScannerCalcu();
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to calculator app: Please enter ur choice "+
                           "1 for multiply, 2 for addition");
        int choice=sc.nextInt();
        System.out.println("enter value of A: ");
        int a= sc.nextInt();
        System.out.println("enter value of B: ");
        int b=sc.nextInt();

        if(choice==1){
            obj.multiply(a,b);
        }
        else if(choice==2){
            obj.addition(a,b);
        }


    }
}
