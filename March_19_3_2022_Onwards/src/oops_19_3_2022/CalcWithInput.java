package oops_19_3_2022;

public class CalcWithInput {

    public void addition(int a,int b){
        int sum=a+b;
        System.out.println(sum);
    }
    public int subtraction(int a,int b){
        int minus=a-b;
        return minus;
    }
    public void minus(int a, int b){
        int result=a-b;
        System.out.println(result);
    }
    public void multiply(int a, int b){
        int multiplication=a*b;
        System.out.println(multiplication);
    }
    public float into(float a,float b){
        float result=a*b;
        return result;
    }
    public void division(int a,int b){
        int division=a/b;
        System.out.println(division);
    }
    public double divide(double a, double b){
        double divide=a/b;
        return divide;
    }

    public static void main(String[] args) {
        CalcWithInput cwi=new CalcWithInput();
        cwi.addition(2,3);
        int minus=cwi.subtraction(5,4);
        System.out.println(minus);
        cwi.minus(18,9);
        cwi.multiply(5,4);
        float result=cwi.into(9.2f,8.5f);
        System.out.println(result);
        cwi.division(81,9);
        double divide=cwi.divide(5.4,2.3);
        System.out.println(divide);
    }
}
