package scanner;

import java.util.Scanner;

public class Scan_Calc {
    public static void main(String[] args) {
        //syntax: scanner obj=new Scanner(System.in);


        Scanner obj=new Scanner(System.in);
        System.out.println(" Welcome to calculator app Please enter your choice:" +
                                    "1 for add, 2 for subtraction,3 for multiplication,4 for division");
        int choice= obj.nextInt();

        System.out.println("Enter value of a ");
        int a= obj.nextInt();
        System.out.println("Enter value of b ");
        int b= obj.nextInt();

        if(choice==1){
            int add=a+b;
            System.out.println("add is "+add);
        }
        else if(choice==2){
            int subtraction=a-b;
            System.out.println("subtraction is "+subtraction);
        }
        else if(choice==3){
            int multiplication=a*b;
            System.out.println("multiplication is "+multiplication);
        }
        else if(choice==4){
            int division=a/b;
            System.out.println("division is "+division);
        }


    }
}
