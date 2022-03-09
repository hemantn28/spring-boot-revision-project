package method_and_object;

public class ReturnType {
    public String message(){
        String test="Bhushan";
        return test;
    }
    public int getAge(){
        int age=19;
        return age;
    }
    public double getSalary(){
        double salary=98635.500;
        return salary;
    }
    public double getprice(){
        double price=85.61;
        return price;
    }
    public int makeSum(int num){
        int sum=num+num;
        return sum;
    }
    public int makeMinus(int num1, int num2){
        int minus=num1-num2;
        return minus;
    }

    public static void main(String[] args) {
        ReturnType obj=new ReturnType();
        String test=obj.message();
        System.out.println("Output of message method is "+test);
        int age=obj.getAge();
        System.out.println("Age is "+age);
        double salary= obj.getSalary();
        System.out.println("Salary is "+salary);
        double price=obj.getprice();
        System.out.println("price is "+price);
        int sum=obj.makeSum(5);
        System.out.println("sum is "+sum);
        int minus=obj.makeMinus(45,10);
        System.out.println("minus is "+minus);
    }
}
