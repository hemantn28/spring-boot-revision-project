package sunday_20_3_2022;

public class InputParameter {
    public void message(String name){
        String var=name;
        System.out.println("This is message method "+ var + " Welcome to java");
    }
    public void checkEligibility(int age){
        if (age>=18){
            System.out.println("eligible for voting");
        }
        else{
            System.out.println("not eligible");
        }
    }
    public void makeCube(int num){
        int cube=num*num*num;
        System.out.println("cube is "+cube);
    }
    public void printInfo(String name, int age){
        System.out.println("name is "+name);
        System.out.println("age is "+age);
    }
    public void display(String name, int age, double salary){
        System.out.println("My name is "+name);
        System.out.println("My age is "+age);
        System.out.println("My salary is "+salary);
    }
    public void addition(int a, int b){
        int sum=a+b;
        System.out.println("sum is "+sum);
    }
    public void subtraction(int a,int b){
        int subtraction=a-b;
        System.out.println("subtraction is "+subtraction);
    }
    public void multiply(int a, int b){
        int multiply=a*b;
        System.out.println("multiply is "+multiply);
    }
    public void division(int a,int b){
        int division=a/b;
        System.out.println("division is "+division);
    }

    public static void main(String[] args) {
        InputParameter in=new InputParameter();
        in.message("Ram");
        in.checkEligibility(17);
        in.makeCube(25);
        in.printInfo("Suresh",23);
        in.display("Vinit",25,96532.54);
        in.addition(2,3);
        in.subtraction(5,4);
        in.multiply(6,7);
        in.division(8,4);
    }
}

