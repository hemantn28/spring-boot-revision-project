package returntype;

public class DemoCalc {
    //syntax: access_simpliifer return_type method_name(parameter){CODE}

    public String message(){

        String subject="Maths";
        return subject;
    }
    public int getage(){
        int age=24;
        return age;
    }
    public double getsalary(){
        double salary=85632.50;
        return salary;
    }

    public static void main(String[] args) {
        DemoCalc std=new DemoCalc();
        String var=std.message();
        System.out.println("output of message method is "+var);

        int age=std.getage();
        System.out.println("Age is "+age);

        double salary=std.getsalary();
        System.out.println("Salary is "+salary);
    }

}
