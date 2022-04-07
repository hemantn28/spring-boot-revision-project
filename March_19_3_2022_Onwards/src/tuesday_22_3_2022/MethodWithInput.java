package tuesday_22_3_2022;

public class MethodWithInput {

    public void message(String  name){
        String var=name;
        System.out.println(var + " This is message method ");
    }
    public void checkEligibility(int age){
        if (age>18){
            System.out.println("eligible for voting");
        }
        else{
            System.out.println("not eligible");
        }
    }
    public void makeSquare(int num){
        int square=num*num;
        System.out.println("square is "+square);
    }
    public void display(String name, int age){
        System.out.println("name is  "+name);
        System.out.println("age is  "+age);
    }
    public void addition(int a, int b){
        int addition=a+b;
        System.out.println("addition is "+addition);
    }
    public void subtraction(int a, int b){
        int subtraction=a-b;
        System.out.println("subtraction is "+subtraction);
    }
    public void multiply(int a, int b){
        int multiply=a*b;
        System.out.println("multiply is "+multiply);
    }
    public void division(int a, int b){
        int division=a/b;
        System.out.println("division is "+division);
    }
    public void checkInfo(String name, int age, double Salary){
        System.out.println("name is "+name);
        System.out.println("age is "+age);
        System.out.println("Salary is "+Salary);
    }

    public static void main(String[] args) {
        MethodWithInput mwi=new MethodWithInput();
        mwi.message("Manish");
        mwi.checkEligibility(19);
        mwi.makeSquare(8);
        mwi.display("Wahid",45);
        mwi.addition(4,5);
        mwi.subtraction(45,12);
        mwi.multiply(45,5);
        mwi.division(456,3);
        mwi.checkInfo("Sanjay",50,85632.54);
    }
}
