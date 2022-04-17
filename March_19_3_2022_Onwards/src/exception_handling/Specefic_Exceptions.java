package exception_handling;

import java.util.Scanner;

public class Specefic_Exceptions {
    public static void main(String[] args) {
        int []marks={7,56,6};

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array index");
       int ind= sc.nextInt();

        System.out.println("Enter the number u want to divide the value with");
        int number=sc.nextInt();
        try {
            System.out.println("The value at array index entered is: " +marks[ind]);
            System.out.println("The value of array value/number is: "+marks[ind]/number);
        }
        catch(Exception e){
            System.out.println("some exception occurred");
            System.out.println(e);
        }
    }
}
