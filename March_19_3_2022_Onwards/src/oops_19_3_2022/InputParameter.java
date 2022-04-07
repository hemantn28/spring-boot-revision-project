package oops_19_3_2022;

public class InputParameter {

    public void message(String name){
        String var=name;
        System.out.println("This is message method "+var+ " Welcome to java");
    }
    public void checkEligibility(int age){
        if (age>18){
            System.out.println("U r eligible for voting");
        }
        else{
            System.out.println("U r not eligible for voting");
        }
    }
    public void makeCube(int num){
        int cube=num*num*num;
        System.out.println(cube);
    }
    public void test(String name,int age){
        System.out.println(name);
        System.out.println(age);
    }
    public void check(String company, int age, double salary){
        System.out.println(company);
        System.out.println(age);
        System.out.println(salary);
    }


    public static void main(String[] args) {
        InputParameter ip=new InputParameter();
    ip.message("Rahul");
    ip.checkEligibility(15);
    ip.makeCube(3);
    ip.test("Raj",21);
    ip.check("Ramesh",23,98000.50);
    }
}
