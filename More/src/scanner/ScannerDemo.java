package scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //syntax:Scanner obj_name=new Scanner(System.in);

        Scanner sc=new Scanner(System.in);

        //reading string input
        System.out.println("plz enter ur Subject ");
        String subject=sc.nextLine();
        System.out.println("u hav enterd ur subject "+subject);

        //reading integer input
        System.out.println("plz enter ur marks ");
        int marks=sc.nextInt();
        System.out.println("u have entered ur marks as "+marks);

        //reads decimal value
        System.out.println("plz enter ur age ");
        double age=sc.nextDouble();
        System.out.println("u have enterd ur age as "+age
        );


    }
}
