package sunday_20_3_2022;

import java.util.Scanner;

public class ScannerCalc {

    /*public void addition(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("sum is "+sum);
    }*/

    /*public void subtraction(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b=sc.nextInt();
        int subtraction=a-b;
        System.out.println("subtraction is "+subtraction);
    }*/
    /*public void multiply(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b=sc.nextInt();
        int multiply=a*b;
        System.out.println("multiply is "+multiply);
    }*/
    public void division(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b=sc.nextInt();
        int division=a/b;
        System.out.println("division is "+division);
    }

    public static void main(String[] args) {
        ScannerCalc sclc=new ScannerCalc();
    //    sclc.addition();
    //    sclc.subtraction();
    //      sclc.multiply();
        sclc.division();
    }
}
