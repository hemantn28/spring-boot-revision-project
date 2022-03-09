package scanner;

import java.util.Scanner;

public class Scanner_Calc{

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        //multiply
        Scanner multiply=new Scanner(System.in);
        System.out.println("enter value of a ");
        int a= multiply.nextInt();
        System.out.println("Enter value of b");
        int b= multiply.nextInt();

        int multiplication=a*b;
        System.out.println("multiplication is "+multiplication);

        //divide
        Scanner divide=new Scanner(System.in);
        System.out.println("enter aq");
        int aq= divide.nextInt();
        System.out.println("enter qa");
        int qa= divide.nextInt();

        int division=aq/qa;
        System.out.println("division is "+division);

        //minus
        Scanner subtract=new Scanner(System.in);
        System.out.println("enter we");
        int we= subtract.nextInt();
        System.out.println("enter an");
        int an= subtract.nextInt();

        int minus=we-an;
        System.out.println("minus is "+minus);

        //sum
        Scanner add=new Scanner(System.in);
        System.out.println("enter s");
        int s= add.nextInt();
        System.out.println("enter d");
        int d= add.nextInt();

        int sum=a+d;
        System.out.println("Sum is "+sum);


    }
}