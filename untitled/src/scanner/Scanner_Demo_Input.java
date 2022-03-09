package scanner;

import java.util.Scanner;

public class Scanner_Demo_Input {
    public static void main(String[] args) {
        // syntax: Scanner obj=new Scanner(System.in);
        Scanner obj=new Scanner(System.in);

        //Reading string Input

        System.out.println("Please enter your name");
        String name=obj.nextLine();//reads String Input

        System.out.println("You have entered your name as "+name);

        //reading integer input

        System.out.println("Please enter your age");
        int age=obj.nextInt();//reads integer input
        System.out.println("You have entered your age as "+age);

        //Reading decimal input

        System.out.println("Please enter price ");

        double price=obj.nextDouble();//reads decimal input

        System.out.println("You have entered price as "+price);

    }
}
