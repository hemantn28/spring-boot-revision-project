package firstproject;

import java.util.Scanner;

public class Else_If_Ladder2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int marks;
        System.out.println("enter your marks");
        marks=sc.nextInt();
        if(marks>80){
            System.out.println("You are intelligent student");
        }
        else if(marks>60){
            System.out.println("You are average student");
        }
        else if(marks>45){
            System.out.println("You are below average student");
        }
        else{
            System.out.println("You are poor student");
        }
    }
}
