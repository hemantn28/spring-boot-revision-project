package sunday_20_3_2022;

public class Calculator {

    public void addition(){
        int a=5;
        int b=6;
        int sum=a+b;
        System.out.println("sum is "+sum);
    }

    public void subtraction(){
        int a=8;
        int b=4;
        int c=a-b;
        System.out.println("subtraction is "+c);
    }
    public void multiply(){
        int a=8;
        int b=7;
        int c=a*b;
        System.out.println("multiply is "+c);
    }
    public void division(){
        double a=25;
        double b=2;
        double c=a/b;
        System.out.println("division is "+c);
    }
    public static void main(String[] args) {
        Calculator clc=new Calculator();
        clc.addition();
        clc.subtraction();
        clc.multiply();
        clc.division();

    }
}
