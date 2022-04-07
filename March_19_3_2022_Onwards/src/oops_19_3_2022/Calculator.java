package oops_19_3_2022;

public class Calculator {
    //addition
    public void addition(){
        int a=1;
        int b=2;
        int c=a+b;
        System.out.println(c);
    }
    public void subtraction(){
        int a=2;
        int b=3;
        int c=b-a;
        System.out.println(c);
    }
    public void multiply(){
        int a=4;
        int b=5;
        int c=a*b;
        System.out.println(c);
    }
    public void division(){
        int a=6;
        int b=3;
        int c=a/b;
        System.out.println(c);
    }
    public void division1(){
        float a=22f;
        float b=7f;
        float c=a/b;
        System.out.println(c);
    }

    public static void main(String[] args) {
    Calculator calc=new Calculator();
    calc.addition();
    calc.subtraction();
    calc.multiply();
    calc.division1();
    }
}
