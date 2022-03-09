package exercise;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        System.out.println("enter the value of x and y");
        Scanner sc=new Scanner(System.in);

        //define variables

        int x= sc.nextInt();
        int y= sc.nextInt();

        System.out.println("before swapping numbers: "+x+" "+y);
        //swapping
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("after swapping "+x+" "+y);

    }
}
