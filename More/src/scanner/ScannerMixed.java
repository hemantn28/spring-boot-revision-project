package scanner;

import java.util.Scanner;

public class ScannerMixed {
    public static void main(String[] args) {
        //syntax: Scanner sc=new Scanner(system.in);

        Scanner sc = new Scanner(System.in);

        //reading string value
        System.out.println("enter ur name ");
        String name= sc.nextLine();
        System.out.println("u have entered ur name as "+name);

        //reading integer value
        System.out.println("enter ur marks ");
        int marks = sc.nextInt();
        System.out.println("u have entered ur marks as " + marks);

        //reading decimal value
        System.out.println("enter ur age ");
        double age=sc.nextInt();
        System.out.println("u have entered ur age as "+age);


    }
}
