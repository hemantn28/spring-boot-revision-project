package methodswithinput;

public class Inputs {
    //syntax: access_simplifier return_type method_name(INPUT PARAMETER){CODE}

    public void mobile(String name){
        String var=name + " Welcome to Mobile world ";

        System.out.println("This is mobile method "+ var);
    }
    public void test(String name, double salary){
        System.out.println("Name is "+name);
        System.out.println("Salary is "+salary);
    }
    public void checkeligibility(int age){
        if(age>18){
            System.out.println("Eligible for voting");
        }
        else{
            System.out.println("Not eligible");
        }
    }
    public void makesquare(int number){
        int result=number*number;
        System.out.println("Square of given number is "+result);
    }
    public void rohit(String name,String subject, double marks){
        System.out.println("Name of student is "+ name);
        System.out.println("Name of subject is "+subject);
        System.out.println("Marks are "+marks);
    }

    public void city(String cityname,double temperature){
        System.out.println("Cityname is "+cityname);
        System.out.println("Temperature is "+ temperature);
    }

    public void standard(String name, String section){
        System.out.println("Name is "+name);
        System.out.println("Section is "+section);
    }
    public void division(String student_name,double marks){
        System.out.println("Student name is "+student_name);
        System.out.println("Marks are "+marks);
    }
    public static void main(String[] args) {
        Inputs obj=new Inputs();
        obj.mobile("Ramesh");
        obj.test("Vipin", 950023.50);
        obj.checkeligibility(19);
        obj.makesquare(25);
        obj.rohit("Rohit","maths",95);
        obj.city("Agra",35.5);
        obj.standard("gaurav","IT");
        obj.division("Keshav",85.5);
    }
}
