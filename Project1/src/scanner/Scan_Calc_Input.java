package scanner;

import java.util.Scanner;

public class Scan_Calc_Input {
    public void addition(int a, int b){
        int result=a+b;
        System.out.println("addition is "+result);

    }
    public void subtraction(int a,int b){
        int result=a-b;
        System.out.println("subtraction is "+result);
    }
    public void multiply(int a,int b){
        int result=a*b;
        System.out.println("multiply is "+result);
    }
    public void divide(int a,int b){
        int result=a/b;
        System.out.println("divide is "+result);
    }

    public static void main(String[] args) {
        Scan_Calc_Input obj=new Scan_Calc_Input();
        Scanner sub=new Scanner(System.in);
        System.out.println(" Welcome to calculator app Please enter your choice: " +
                           "1 for add,2 for subtract,3 for multiply,4 for divide ");
        int choice= sub.nextInt();
        System.out.println("Please enter value of a ");
        int a= sub.nextInt();
        System.out.println("Please enter value of b ");
        int b= sub.nextInt();

        if(choice==1){
            obj.addition(a,b);
        }
        else if(choice==2){
            obj.subtraction(a,b);
        }
        else if(choice==3){
            obj.multiply(a,b);
        }
        else if(choice==4){
            obj.divide(a,b);
        }
    }



}
