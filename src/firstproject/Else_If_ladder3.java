package firstproject;

import java.util.Scanner;

public class Else_If_ladder3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int salary;
        System.out.println("enter your salary here");
        salary=sc.nextInt();
        if(salary>90000){
            System.out.println("You are highly paid");
        }
        else if(salary>70000){
            System.out.println("You are averagely paid");
        }
        else if(salary>50000){
            System.out.println("You are poorly paid");
        }
        else {
            System.out.println("You are discriminated");
        }

    }
}
