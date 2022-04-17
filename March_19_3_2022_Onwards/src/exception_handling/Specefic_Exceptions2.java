package exception_handling;

import java.util.Scanner;

public class Specefic_Exceptions2 {
    public static void main(String[] args) {

        int[]marks={7,56,6};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Index");
        int ind=sc.nextInt();

        System.out.println("Enter the number you want to divide the value with");
        int number=sc.nextInt();
        try {
            System.out.println("The value at Array index entered is: "+marks[ind]);
            System.out.println("The value of Array value/number is: "+marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occurred");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurred");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other exception occurred");
            System.out.println(e);
        }
    }
}
