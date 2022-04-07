package sunday_20_3_2022;

public class ReturnType {

    //syntax: access_specifier return_type method_name(parameter){code}
    public String message(){
        String test="java";
        return test;
    }
    public int getAge(){
        int age=23;
        return age;
    }
    public double getSalary(){
        double salary=85236.52;
        return salary;
    }
    public double getValue(){
        double num=22/7;
        return num;
    }
    public int makeSquare(int num){
        int square=num*num;
        return square;
    }
    public int checkEligibility(int age1){
        if (age1>18){
            System.out.println("eligible for voting");
        }
        else{
            System.out.println("not eligible");
        }
        return age1;
    }
    public int addition(int a, int b){
        int addition=a+b;
        return addition;
    }
    public int minus(int a, int b){
        int minus=a-b;
        return minus;
    }
    public int multiply(int a, int b){
        int result=a*b;
        return result;
    }
    public double division(double a, double b){
        double result1=a/b;
        return result1;
    }

    public static void main(String[] args) {
        ReturnType rt=new ReturnType();
        String test=rt.message();
        System.out.println(test);
        int age=rt.getAge();
        System.out.println(age);
        double salary=rt.getSalary();
        System.out.println(salary);
        double num=rt.getValue();
        System.out.println(num);
        int sqaure=rt.makeSquare(15);
        System.out.println(sqaure);
        int age1=rt.checkEligibility(11);
        int addition=rt.addition(5,4);
        System.out.println("addition is "+addition);
        int minus=rt.minus(8,5);
        System.out.println("minus is "+minus);
        int result=rt.multiply(8,9);
        System.out.println("multiply is "+result);
        double result1=rt.division(9,2);
        System.out.println("division is "+result1);


    }
}
