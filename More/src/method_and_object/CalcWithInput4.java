package method_and_object;

public class CalcWithInput4 {
    public void multiply(int a, int b){
        int multiply=a*b;
        System.out.println("multiply is "+multiply);
    }

    public static void main(String[] args) {
        CalcWithInput4 obj=new CalcWithInput4();
        obj.multiply(8,9);
    }
}
