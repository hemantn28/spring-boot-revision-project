package returntype;

public class DemoCalcReturnType {
    public int add(int a, int b){
        int result=a+b;
        return result;
    }
    public int subtract(int a, int b){
        int result=a-b;
        return result;
    }
    public int multiply(int a, int b){
        int result=a*b;
        return result;
    }
    public int divide(int a, int b){
        int result=a/b;
        return result;
    }

    public static void main(String[] args) {
        DemoCalcReturnType high=new DemoCalcReturnType();
        int result=high.add(2,3);
        System.out.println("Add is "+result);

        int subtract=high.subtract(3,2);
        System.out.println("Subtraction is "+subtract);

        int multiply= high.multiply(6,7);
        System.out.println("multiply is "+multiply);

        int divide=high.divide(25,5);
        System.out.println("divide is "+divide);
    }
}