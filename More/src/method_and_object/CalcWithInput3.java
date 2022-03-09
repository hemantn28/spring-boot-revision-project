package method_and_object;

public class CalcWithInput3 {
    public void division(int a, int b){
        int division=a/b;
        System.out.println("division is "+division);
    }
    public void subtraction(int s,int t){
        int subtraction=s-t;
        System.out.println("subtraction is "+subtraction);
    }
    public void addition(int j,int k){
        int addition=j+k;
        System.out.println("addition is "+addition);
    }
    public void multiply(int l, int m){
        int multiply=l*m;
        System.out.println("multiply is "+multiply);
    }

    public static void main(String[] args) {
        CalcWithInput3 obj=new CalcWithInput3();
        obj.addition(4,5);
        obj.subtraction(8,5);
        obj.multiply(4,5);
        obj.division(4,2);
    }
}
