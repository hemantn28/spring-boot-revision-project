package scanner;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        //syntax: Scanner object_name=new Scanner(System.in);

        Scanner obj=new Scanner(System.in);

        //reading string input
        System.out.println("please enter ur name: ");

        String name=obj.nextLine();//reads string input
        System.out.println("you have entered name as: "+name);

        //reading integer input

        System.out.println("plz enter ur age");
        int age=obj.nextInt();//reads integer value
        System.out.println("you have entered ur gae as "+age);

        //reading decimal value

        System.out.println("plz enter ur salary");
        double salary=obj.nextDouble();//reads decimal value
        System.out.println("you have entered ur salary as "+salary);



    }


}
