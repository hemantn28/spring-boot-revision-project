package scanner;

import java.util.Scanner;

public class Demo_Input_Scanner {
    public static void main(String[] args) {
        //syntax:Scanner obj=new Scanner(System.in);

        Scanner obj=new Scanner(System.in);

        //Reading String Input

        System.out.println("Please enter company_name");
        String company_name=obj.nextLine();//reads String input
        System.out.println("You have entered company_name as "+company_name);

        //Reading String input
        System.out.println("Please enter bike_model");
        String bike_model=obj.nextLine();
        System.out.println("You have entered bike_model as "+bike_model);

        //Reading integer input
        System.out.println("please enter bike_capacity");
        int bike_capacity=obj.nextInt();
        System.out.println("You have enterd your bike_capacity as "+bike_capacity);

        //Reading decimal input
        System.out.println("please enter bike_price");
        double price=obj.nextDouble();
        System.out.println("You have entered bike_price");

    }
}
