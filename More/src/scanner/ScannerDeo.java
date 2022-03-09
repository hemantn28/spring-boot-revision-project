package scanner;

import java.util.Scanner;

public class ScannerDeo {
    public static void main(String[] args) {
        //syntax:Scanner objname=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);

        //reading string input
        System.out.println("enter ur bike name ");
        String bike_name=sc.nextLine();
        System.out.println("u have entered ur bike_name as "+bike_name);

        //reading decimal value
        System.out.println("enter ur bike_capacity");
        double bike_capacity= sc.nextDouble();
        System.out.println("u have enterd ur bike_capacity "+bike_capacity);

        //reading integer value
        System.out.println("enter ur bike_speed");
        int bike_speed=sc.nextInt();
        System.out.println("u have entered ur bike_speed "+bike_speed);

    }
}
