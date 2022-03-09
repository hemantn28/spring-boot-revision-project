package scanner;

import java.util.Scanner;

public class Java_Method_Calc {
    public void add(int a, int b) {
        int result = a + b;
        System.out.println("add id " + result);
    }

    public void minus(int a, int b) {
        int result = a - b;
        System.out.println("minus is " + result);
    }

    public void multiply(int a, int b) {
        int result = a * b;
        System.out.println("multiply is " + result);
    }

    public void divide(int a, int b) {
        int result = a / b;
        System.out.println("divide is " + result);
    }

    public static void main(String[] args) {
        Java_Method_Calc ans = new Java_Method_Calc();
        Scanner que = new Scanner(System.in);
        System.out.println("Welcome to calcultor app Please enter your choice : " +
                "1 for add,2 for minus,3 for multiply, 4 for divide");
        int choice = que.nextInt();

        while (choice != 0) {

            System.out.println("enter value of a");
            int a = que.nextInt();
            System.out.println("enter value of b");
            int b = que.nextInt();

            if (choice == 1) {
                ans.add(a, b);
            } else if (choice == 2) {
                ans.minus(a, b);
            } else if (choice == 3) {
                ans.multiply(a, b);
            } else if (choice == 4) {
                ans.divide(a, b);
            }
            System.out.println("Please enter 0 to exit from calculator");
            choice = que.nextInt();


        }

    }
}




