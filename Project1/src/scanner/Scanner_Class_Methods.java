package scanner;

import java.util.Scanner;

public class Scanner_Class_Methods {
    public void addition(int a,int b){
        int result=a+b;
        System.out.println("addition is "+result);
    }
    public void subtraction(int a, int b){
        int result=a-b;
        System.out.println("subtraction is "+result);
    }
    public void multiply(int a,int b){
        int result=a*b;
        System.out.println("multiply is "+result);
    }
    public void division(int a,int b){
        int result=a/b;
        System.out.println("division is "+result);
    }

    public static void main(String[] args) {
        Scanner_Class_Methods obj = new Scanner_Class_Methods();
        Scanner sub = new Scanner(System.in);
        System.out.println("Welcome to calculator app please enter your choice : " +
                "1 for addition,2 for subtraction,3 for multiply,4 for division");
        int choice = sub.nextInt();
        System.out.println("Please enter value of a");
        int a = sub.nextInt();
        System.out.println("Please enter value of b");
        int b = sub.nextInt();

        if (choice == 1) {
            obj.addition(a, b);

        } else if (choice == 2) {
            obj.subtraction(a, b);
        } else if (choice == 3) {
            obj.multiply(a, b);
        } else if (choice == 4) {
            obj.division(a, b);
        }


    }

    }
