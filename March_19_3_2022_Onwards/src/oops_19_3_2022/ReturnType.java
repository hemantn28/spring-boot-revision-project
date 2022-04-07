package oops_19_3_2022;

public class ReturnType {

    public String Task(){
        String name="Java";
        return name;
    }
    public int getAge(){
        int age=23;
        return age;
    }
    public double getSalary(){
        double salary=58643.52;
        return salary;
    }
    public int checkEligibility(int age){
        if (age>18){
            System.out.println("U r eligible for voting");
        }
        else{
            System.out.println("U r not eligible for voting");
        }
        return age;
    }
    public int marks(){
        int marks=84;
        return marks;
    }

    public float price(){
        float price=85.5f;
        return price;
    }
    public String message(){
        String var="Java";
        return var;
    }
    public int checkAge(int age){
        return age;
    }
    public int makeSquare(int num){
        int square=num*num;
        return square;
    }
    public  float division(float a, float b){
        float division=a/b;
        return division;
    }
    public static void main(String[] args) {
        ReturnType rt=new ReturnType();
        rt.Task();
        System.out.println(rt.Task());
        System.out.println(rt.getAge());
        System.out.println(rt.getSalary());
        rt.checkEligibility(16);
        System.out.println(rt.marks());
        System.out.println(rt.price());
        System.out.println(rt.message());
        System.out.println(rt.checkAge(24));
        System.out.println(rt.makeSquare(5));
        System.out.println(rt.division(4.2f,2.3f));
    }
}
