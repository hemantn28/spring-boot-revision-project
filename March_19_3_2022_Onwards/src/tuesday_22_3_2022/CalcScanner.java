package tuesday_22_3_2022;

import java.util.Scanner;

public class CalcScanner {

    public void addition(int a, int b){
        int c=a+b;
        System.out.println("addition is "+c);
    }
    public void subtraction(int a, int b){
        int c=a-b;
        System.out.println("subtraction is "+c);
    }
    public void multiply(int a, int b){
        int c=a*b;
        System.out.println("multiply is "+c);
    }
    public void division(int a, int b){
        int c=a/b;
        System.out.println("division is "+c);
    }

    public static void main(String[] args) {
        CalcScanner cs=new CalcScanner();
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to calculator app: please enter ur choice: 1 for addition, 2 for subtraction, 3 for multiply, 4 for division");
        int choice=sc.nextInt();


        while(choice!=0){
            System.out.print("enter value of a: ");
            int a=sc.nextInt();
            System.out.print("enter the value of b: ");
            int b=sc.nextInt();

            if (choice==1){
            cs.addition(a,b);
        }
        else if (choice==2){
            cs.subtraction(a,b);
        }
        else if (choice==3){
            cs.multiply(a,b);
        }
        else if (choice==4){
            cs.division(a,b);
        }
            System.out.println("enter 0 to exit from calculator");
        choice=sc.nextInt();


        }
    }
}
