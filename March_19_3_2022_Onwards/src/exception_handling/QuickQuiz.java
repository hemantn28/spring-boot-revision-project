package exception_handling;

import java.util.Scanner;

public class QuickQuiz {

    public static void main(String[] args) {

        int[]marks={7,56,6};
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while(flag){
            System.out.println("Enter the value of index");
            int ind=sc.nextInt();
            try {
                System.out.println("Welcome to Java");
                try{
                    System.out.println(marks[ind]);
                    flag = false;
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
        System.out.println("Thanks for using this programme");




    }
}
