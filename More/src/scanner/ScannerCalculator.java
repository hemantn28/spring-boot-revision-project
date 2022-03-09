package scanner;

import java.util.Scanner;

public class ScannerCalculator {
    public void division(int a, int b){
        int division=a/b;
        System.out.println("division is "+division);
    }
    public void subtraction(int a, int b){
        int subtraction=a-b;
        System.out.println("subtraction is "+subtraction);
    }

    public static void main(String[] args) {
        ScannerCalculator obj=new ScannerCalculator();
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to calculator app: Please enter ur choice:" +
                           "1 for division, 2 for subtraction");
        int choice=sc.nextInt();
        System.out.println("Enter value of a: ");
        int a= sc.nextInt();
        System.out.println("Enter value of b: ");
        int b= sc.nextInt();

        if (choice==1){
            obj.division(a,b);
        }
        else if(choice==2){
            obj.subtraction(a,b);
        }

    }
}
