package returntype;

public class CalcWithOutput {
    public int addition(int a,int b){
        int result=a+b;
        return result;

    }public int subtraction(int a, int b){
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
        CalcWithOutput obj=new CalcWithOutput();
        int result=obj.addition(3,6);
        System.out.println("Addition is "+result);

        int sub=obj.subtraction(5,3);
        System.out.println("Subtraction is "+sub);

        int multiplication=obj.multiply(5,6);
        System.out.println("Multiply is "+multiplication);

        int division=obj.divide(9,3);
        System.out.println("Divide is "+division);

    }
}
