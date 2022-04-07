package oops_19_3_2022;


import java.util.Scanner;

public class CalcScanner {

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
        CalcScanner csc=new CalcScanner();
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to calculator app: Enter ur choice: "+ " 1 for add, 2 for subtract, 3 for multiplication, 4 for divide");
        int choice=sc.nextInt();

        while (choice!=0){
            System.out.print("Enter value of a: ");
            int a= sc.nextInt();
            System.out.print("Enter value of b: ");
            int b=sc.nextInt();

            if (choice==1){
                csc.addition(a,b);
            }
            else if(choice==2){
                csc.subtraction(a,b);
            }
            else if(choice==3){
                csc.multiply(a,b);
            }
            else if (choice==4){
                csc.division(a,b);
            }
            System.out.println("Enter 0 to exit from calculator or 1 for add, 2 for subtract, 3 for multiplication, 4 for divide ");
            choice=sc.nextInt();



        }





    }
}
