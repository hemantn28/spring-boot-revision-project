package returntype;

public class ReturnCalc {
    public int add(int a,int b,int c){
        int result=a+b+c;
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
        ReturnCalc obj=new ReturnCalc();
        int addition=obj.add(8,9,1);
        System.out.println("addition is "+addition);

        int subtract=obj.subtract(89,23);
        System.out.println("Subtarct is "+subtract);

        int multiply=obj.multiply(74,56);
        System.out.println("multiply is "+multiply);

        int divide=obj.divide(856,236);
        System.out.println("divide is "+divide);

    }
}
