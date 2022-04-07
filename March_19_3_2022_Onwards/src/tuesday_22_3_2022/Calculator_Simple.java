package tuesday_22_3_2022;

public class Calculator_Simple {

    //addition
    public void addition(){
        int a=8;
        int b=9;
        int c=a+b;
        System.out.println("addition is "+c);
    }
    public void subtraction(){
        int a=90;
        int b=67;
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
        int a=145;
        int b=5;
        int c=a/b;
        System.out.println("division is "+c);
    }

    public static void main(String[] args) {
        Calculator_Simple cs=new Calculator_Simple();
        cs.addition();
        cs.subtraction();
        cs.multiply();
        cs.division();

    }
}
