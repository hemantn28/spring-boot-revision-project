package oops_19_3_2022;


import java.util.*;

public class DemoScanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("plz enter ur name: ");
        String name=sc.nextLine();
        System.out.println("U have entered ur name as "+name);

        Scanner sc1=new Scanner(System.in);
        System.out.print("Enter ur age: ");
        int age=sc.nextInt();
        System.out.println("U have entered ur age as "+age);

        Scanner sc2=new Scanner(System.in);
        System.out.print("Enter ur salary: ");
        double salary=sc.nextDouble();
        System.out.println("U have entered ur salary as "+salary);

        Scanner sc3=new Scanner(System.in);
        System.out.print("Enter ut city: ");
        String city=sc3.nextLine();
        System.out.println("U have entered ur city as "+city);

        Scanner sc4=new Scanner(System.in);
        System.out.print("Enter ur speed: ");
        double speed=sc4.nextDouble();
        System.out.println("U have entered ur speed as "+speed);

    }



}
