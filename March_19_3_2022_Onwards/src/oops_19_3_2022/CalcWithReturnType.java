package oops_19_3_2022;

public class CalcWithReturnType {
    public int addition(int a, int b){
        int add=a+b;
        return add;
    }
    public float subtraction(float a,float b){
        float minus=a-b;
        return minus;
    }
    public double multiply(double a, double b){
        double multiplication= a*b;
        return multiplication;
    }
    public double division(double a, double b){
        double divide=a/b;
        return divide;

    }

    public static void main(String[] args) {
        CalcWithReturnType cwrt=new CalcWithReturnType();
        int add=cwrt.addition(5,9);
        System.out.println(add);

        float minus= cwrt.subtraction(6.5f,3.2f);
        System.out.println(minus);

        double multiplication= cwrt.multiply(9.8,7.1);
        System.out.println(multiplication);

        double divide= cwrt.division(98,3);
        System.out.println(divide);
    }
}
