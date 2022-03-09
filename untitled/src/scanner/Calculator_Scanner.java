package scanner;

import java.util.Scanner;

public class Calculator_Scanner {
    public static void main(String[] args) {
        //syntax: Scanner obj=new Scanner(System.in);
        Scanner obj=new Scanner(System.in);

        //sum
        Scanner sum=new Scanner(System.in);
        System.out.println("enter value of a : ");
        int a=sum.nextInt();
        System.out.println("Enter value of b : ");
        int b=sum.nextInt();

        int addition=a+b;
        System.out.println("Sum is "+addition);

        //subtract
        Scanner subtract=new Scanner(System.in);
        System.out.println("Enter value of c : ");
        int c=subtract.nextInt();
        System.out.println("Enter value of d : ");
        int d= subtract.nextInt();

        int subtraction=c-d;
        System.out.println("Subtraction is "+subtraction);

        //multiply
        Scanner multiply=new Scanner(System.in);
        System.out.println("Enter value of e : ");
        int e= multiply.nextInt();
        System.out.println("Enter value of f : ");
        int f= multiply.nextInt();

        int multiplication=e*f;
        System.out.println("Multiplication is "+multiplication);

        //divide
        Scanner divide=new Scanner(System.in);
        System.out.println("Enter value of g : ");
        int g= divide.nextInt();
        System.out.println("ENter value of h : ");
        int h= divide.nextInt();

        int division=g/h;
        System.out.println("division is "+division);






    }

}
