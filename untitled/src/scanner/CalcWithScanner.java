package scanner;

import java.util.Scanner;

public class CalcWithScanner {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        //division
        Scanner divide=new Scanner(System.in);
        System.out.println("Enter value of a : ");
        int a= divide.nextInt();
        System.out.println("Enter value of b : ");
        int b=divide.nextInt();

        int division=a/b;
        System.out.println("division is "+division);

        //multiply
        Scanner multiply=new Scanner(System.in);
        System.out.println("enter value of c : ");
        int c= multiply.nextInt();
        System.out.println("Enter value of d : ");
        int d= multiply.nextInt();

        int multiplication=c*d;
        System.out.println("multiplication is "+multiplication);

        //subtraction
        Scanner subtract=new Scanner(System.in);
        System.out.println("Enter value of y : ");
        int y= subtract.nextInt();
        System.out.println("Enter value of z : ");
        int z=subtract.nextInt();

        int subtraction=y-z;
        System.out.println("Subtraction is "+subtraction);

        //sum
        Scanner addition=new Scanner(System.in);
        System.out.println("enter value of q: ");
        int q= addition.nextInt();
        System.out.println("Enetr value of w: ");
        int w= addition.nextInt();

        int sum=q+w;
        System.out.println("sum is "+sum);
    }

}
