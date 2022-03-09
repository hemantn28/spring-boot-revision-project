package scanner;

import java.util.Scanner;

public class Scanner_Calculator {


    public static void main(String[] args) {

        //addition

        Scanner obj=new Scanner(System.in);
        System.out.println("Please enter value of a : ");
        int a=obj.nextInt();
        System.out.println("Please enter value of b : ");
        int b=obj.nextInt();

        int addition=a+b;
        System.out.println("Addition is "+addition);

        //subtraction

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter value of c");
        int c=scan.nextInt();
        System.out.println("enter value of d");
        int d= scan.nextInt();

        int subtraction=c-d;
        System.out.println("Subtraction is "+subtraction);

        //multiplication

        Scanner sub=new Scanner(System.in);
        System.out.println("Enter value of e");
        int e=sub.nextInt();
        System.out.println("Enter value of f");
        int f=sub.nextInt();

        int multiplication=e*f;
        System.out.println("multilication is "+multiplication);

        //division
        Scanner get=new Scanner(System.in);
        System.out.println("ENter value of g");
        int g=get.nextInt();
        System.out.println("Enter value of h");
        int h=get.nextInt();

        int division=g/h;
        System.out.println("division is "+division);





    }
}
