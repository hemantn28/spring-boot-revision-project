package scanner;

import java.util.Scanner;

public class Scanner_School {
    public static void main(String[] args) {
        //syntax: Scanner obj=new Scanner(System.in);
        Scanner obj=new Scanner(System.in);
        //Reading String Input

        System.out.println("Please enter your name");
        String name=obj.nextLine(); //reads String input
        System.out.println("You have enterd your name as "+name);

        //Reading Integer input
        System.out.println("Please enter your age");
        int age=obj.nextInt();//reads integer input
        System.out.println("You have entered your age as "+age);

        //Reading Decimal input

        System.out.println("please enter your marks");
        double marks=obj.nextDouble();//reads decimal input
        System.out.println("You have entered your marks as "+marks);





    }
}
