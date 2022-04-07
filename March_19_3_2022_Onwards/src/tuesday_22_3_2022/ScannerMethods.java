package tuesday_22_3_2022;

import java.util.Scanner;

public class ScannerMethods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur name: ");
        String name=sc.nextLine();
        System.out.println("u have entered ur name as "+name);

        System.out.println("enter ut age:");
        int age=sc.nextInt();
        System.out.println("U have entered ur age as: "+age);

        System.out.println("enter ur Salary");
        double Salary=sc.nextDouble();
        System.out.println("U have entered ur Salary as: "+Salary);

    }

}
