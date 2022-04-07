package wednesday_23_3_2022;

import java.util.Scanner;

/*class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("I m flying");
    }
}*/
interface AdvancedArithmetic{
    public abstract int divisorSum(int n);
}
class MyCalculator implements AdvancedArithmetic{
    public int divisorSum(int n){
        int ans=0;
        for (int i=1; i<=n; i++){
            if(n%i==0) ans +=i;
        }
        return ans;
    }
}
public class OOPS {
    public static void main(String[] args) {
       /* Bird bd=new Bird();
        bd.walk();
        bd.fly();*/
        MyCalculator mc=new MyCalculator();
        System.out.println("I implemented: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(mc.divisorSum(n) + "\n");
    }
}
