package scanner;

import java.util.Scanner;

public class Demo_Scanner {
    public static void main(String[] args) {
        //syntax: Scanner obj= new Scanner(System.in);

        Scanner obj=new Scanner(System.in);

        // Reading String input

        System.out.println("Please enter your name");

        String name= obj.nextLine();//reads string input
        System.out.println("You have entered your name as "+name);

        //Reading Integer Input

        System.out.println("Please enter your age");

        int age=obj.nextInt(); //reads integer input
        System.out.println("you have entered age as "+age);

        //Reading decimal input
        
        System.out.println("Please enter your salary");
        
        double salary=obj.nextDouble();//reads decimal value

        System.out.println("You have entered your salary as "+salary);
                
    }
}
