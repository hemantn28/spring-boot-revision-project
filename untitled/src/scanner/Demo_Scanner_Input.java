package scanner;

import java.util.Scanner;

public class Demo_Scanner_Input {
    public static void main(String[] args) {
        //syntax: Scanner obj=new Scanner(System.in);
        Scanner obj=new Scanner(System.in);

        //Reading String input
        System.out.println("Please enter your name");
        String name=obj.nextLine();//reads String input
        System.out.println("You have entered your name as "+name);

        //Reading Integer value
        System.out.println("Please enter your name");
        int age=obj.nextInt();// reads integer input
        System.out.println("you have entered your age as "+age);

        //Readig Decimal input
        System.out.println("Please enter your salary");
        double salary=obj.nextDouble(); //reads decimal input
        System.out.println("You have entered your salary as "+salary);
    }
}
