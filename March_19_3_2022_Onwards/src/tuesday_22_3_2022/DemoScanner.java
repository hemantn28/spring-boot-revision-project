package tuesday_22_3_2022;


import java.util.Scanner;


public class DemoScanner {
    public static void main(String[] args) {
        DemoScanner ds=new DemoScanner();


        Scanner sc=new Scanner(System.in);

        //System.out.println("Plz enter ur name: ");
        //sc.nextLine();

        //System.out.print("Plz enter ur Salary");
        //sc.nextDouble();

        System.out.print("Plz enter ur marks here: ");
        int marks=sc.nextInt();
        System.out.println("You have entered ur marks as "+marks);

    }

}
