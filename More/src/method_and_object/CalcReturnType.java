package method_and_object;

public class CalcReturnType {
    public int addition(int num1, int num2){
        int sum=num1+num2;
        return sum;
    }
    public int subtraction(int num1,int num2){
        int subtraction=num1-num2;
        return subtraction;
    }
    public int multiply(int num1, int num2){
        int multiply=num1*num2;
        return multiply;
    }
    public int divide(int num1, int num2){
        int divide=num1/num2;
        return divide;
    }

    public static void main(String[] args) {
        CalcReturnType obj=new CalcReturnType();
        int sum=obj.addition(5,4);
        System.out.println("addition is "+sum);
        int subtraction=obj.subtraction(9,4);
        System.out.println("Subtraction is "+subtraction);
        int multiply=obj.multiply(4,5);
        System.out.println("multiply is "+multiply);
        int divide=obj.divide(4,2);
        System.out.println("divide is "+divide);
    }
}
