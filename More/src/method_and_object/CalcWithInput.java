package method_and_object;

public class CalcWithInput {
    public void addition(int a, int b){

        int sum=a+b;
        System.out.println("addition is "+sum);

    }
    public  void subtraction(int c,int d){
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
        CalcWithInput obj=new CalcWithInput();
        obj.addition(23,10);
        obj.subtraction(56,35);
        obj.multiply(12,5);
        obj.division(95,19);
    }


}
