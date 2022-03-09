package scanner;

import java.util.Scanner;

public class Scanner_demo {
    public static void main(String[] args) {
        //syntax: Scanner obj= new Scnner(System.in);

        Scanner obj= new Scanner(System.in);

        //Reading String Input

        System.out.println("Please enter your name");

        String name=obj.nextLine(); //reads String input

        System.out.println("You have entered name as "+name);

        //Reading integer input

        System.out.println("Please enter your age");

        int age=obj.nextInt(); //reads integer input

        System.out.println("You have entered age as "+age);

        //Reading decimal input

        System.out.println("Please enter your salary");

        double salary=obj.nextDouble();// reads decimal input

        System.out.println("you have entered your salary as "+salary);






    }
}

