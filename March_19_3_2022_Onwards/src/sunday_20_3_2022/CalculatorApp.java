package sunday_20_3_2022;

import java.util.Scanner;

public class CalculatorApp {
    public void addition(int a, int b){
        int add=a+b;
        System.out.println("add is "+add);
    }
    public void subtraction(int a, int b){
        int subtract=a-b;
        System.out.println("subtract is "+subtract);
    }
    public void multiply(int a, int b){
        int multiplication=a*b;
        System.out.println("multiplication is "+multiplication);
    }
    public void division(int a, int b){
        int divide=a/b;
        System.out.println("divide is "+divide);
    }

    public static void main(String[] args) {
        CalculatorApp cap=new CalculatorApp();
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to calculator app: Enter ur choice: "+ " 1 for add, 2 for subtract, 3 for multiply,4 for division");
        int choice=sc.nextInt();

        while (choice!=0){
            System.out.print("Enter value of a: ");
            int a= sc.nextInt();
            System.out.print("Enter value of b: ");
            int b=sc.nextInt();

            if (choice==1){
                cap.addition(a,b);
            }
            else if (choice==2){
                cap.subtraction(a,b);
            }
            else if (choice==3){
                cap.multiply(a,b);
            }
            else if (choice==4){
                cap.division(a,b);
            }
            System.out.println("Enter 0 to exit from calculator app or 1 for addition, 2 for subtraction, 3 for multiply, 4 for division");
            choice=sc.nextInt();
        }

    }

}
