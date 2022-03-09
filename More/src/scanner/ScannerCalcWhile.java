package scanner;

import java.util.Scanner;

public class ScannerCalcWhile {
    public void multiply(int a, int b) {
        int multiply = a * b;
        System.out.println("multiply is " + multiply);
    }

    public void addition(int a, int b) {
        int addition = a + b;
        System.out.println("addition is " + addition);
    }

    public void division(int a, int b) {
        int division = a / b;
        System.out.println("division is " + division);
    }

    public void subtraction(int a, int b) {
        int subtraction = a - b;
        System.out.println("subtraction is " + subtraction);
    }

    public static void main(String[] args) {
        ScannerCalcWhile obj = new ScannerCalcWhile();

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to calculator app: Please enter ur choice " +
                "1 for addition, 2 for subtraction, 3 for multiply, 4 for division ");

        int choice = sc.nextInt();
        while (choice != 0) {

            System.out.println("enter value of A: ");
            int A = sc.nextInt();
            System.out.println("enter value of B: ");
            int B = sc.nextInt();

            if (choice == 1) {
                obj.addition(A, B);
            } else if (choice == 2) {
                obj.subtraction(A, B);
            } else if (choice == 3) {
                obj.multiply(A, B);
            } else if (choice == 4) {
                obj.division(A, B);
            }
            System.out.println("Please enter 0 to exit from calculator ");
            choice = sc.nextInt();
        }
    }
}


