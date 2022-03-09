package method_and_object;

public class CalcWithInput2 {
    public void addition(int a,int b){
        int sum=a+b;
        System.out.println("sum is "+sum);
    }
    public void subtraction(int c, int d){
        int subtraction=c-d;
        System.out.println("subtraction is "+subtraction);
    }
    public void multiply(int e,int f){
        int multiply=e*f;
        System.out.println("multiply is "+multiply);
    }
    public void division(int g, int h){
        int division=g/h;
        System.out.println("division is "+division);
    }

    public static void main(String[] args) {

        CalcWithInput2 obj=new CalcWithInput2();
        obj.addition(25,8);
        obj.subtraction(145,65);
        obj.multiply(11,5);
        obj.division(80,2);
    }
}
