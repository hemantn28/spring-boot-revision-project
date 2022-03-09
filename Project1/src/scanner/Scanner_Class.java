package scanner;

import java.util.Scanner;

public class Scanner_Class {
    public static void main(String[] args) {
        //syntax: Scanner obj=new Scanner(System.in);
        Scanner obj=new Scanner(System.in);

        //Reading String input
        System.out.println("Please enter your name");
        String name=obj.nextLine();
        System.out.println("You have entered your name as "+name);

        System.out.println("Please enter your age");
        int age=obj.nextInt();
        System.out.println("You have entered your age as "+age);

        System.out.println("Please enter your salary");
        double salary=obj.nextDouble();
        System.out.println("You have entered your salary as "+salary);


    }

    }

