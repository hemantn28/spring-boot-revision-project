package sunday_20_3_2022;

import java.util.Scanner;

public class CalcScanner {

    public void addition(int a, int b){
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
    public void division(int a, int b){
        int result=a/b;
        System.out.println("division is "+result);
    }

    public static void main(String[] args) {
        CalcScanner csc=new CalcScanner();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a=sc.nextInt();
        System.out.print("Enter value of b: ");
        int b=sc.nextInt();
        csc.addition(a,b);
        csc.subtraction(a,b);
        csc.multiply(a,b);
        csc.division(a,b);
    }
}
