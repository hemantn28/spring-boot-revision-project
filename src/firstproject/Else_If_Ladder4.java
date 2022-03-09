package firstproject;

import java.util.Scanner;

public class Else_If_Ladder4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
                int price;
        System.out.println("enter the price of the product");
        price=sc.nextInt();
        if(price>900){
            System.out.println("product is costly");
        }
        else if(price>700){
            System.out.println("product is slightly costly");
        }
        else if(price>500){
            System.out.println("product is fair");
        }
        else{
            System.out.println("product is cheap");
        }
    }
}
