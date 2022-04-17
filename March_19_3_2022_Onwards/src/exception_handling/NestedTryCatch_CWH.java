package exception_handling;

import java.util.Scanner;

public class NestedTryCatch_CWH {
    public static void main(String[] args) {
        int[]marks={7,56,6};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of index");
        int ind=sc.nextInt();
        try {
            System.out.println("Welcome to Java");
            try{
                System.out.println(marks[ind]);
            }
            catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Sorry, this index does not exist");
            System.out.println("Exception in level 2");
            }
        }
        catch (Exception e){
            System.out.println("Exception in level 1");
        }
    }
}
