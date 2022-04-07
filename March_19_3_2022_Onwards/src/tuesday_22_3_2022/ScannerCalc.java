package tuesday_22_3_2022;

import java.util.Scanner;

public class ScannerCalc {

    public void addition(int a, int b) {
        int c = a + b;
        System.out.println("addition is " + c);
    }

    public void subtraction(int a, int b) {
        int c = a - b;
        System.out.println("subtraction is " + c);
    }

    public void multiply(int a, int b) {
        int c = a * b;
        System.out.println("multiply is " + c);
    }

    public void divide(int a, int b) {
        int c = a / b;
        System.out.println("division is " + c);
    }

    public static void main(String[] args) {
        ScannerCalc csc = new ScannerCalc();

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to calculator app: please enter ur choice: 1 for addition, 2 for subtraction, 3 for multiply, 4 for divide ");

        int choice = sc.nextInt();

        while (choice != 0) {

            System.out.println("enter value of a: ");
            int a = sc.nextInt();
            System.out.println("enter value of b: ");
            int b = sc.nextInt();

            if (choice == 1) {
                csc.addition(a, b);
            } else if (choice == 2) {
                csc.subtraction(a, b);
            } else if (choice == 3) {
                csc.multiply(a, b);
            } else if (choice == 4) {
                csc.divide(a, b);
            }

            System.out.println("Please enter 0 to exit from calculator app or 1 for addition, 2 for subtraction, 3 for multiply, 4 for divide ");
            choice = sc.nextInt();


        }

    }


}