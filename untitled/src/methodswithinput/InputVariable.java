package methodswithinput;

public class InputVariable {
    //syntax: access_specifier return_type method_name(input parameter){CODE}

    public void input(String name){
        String var=name + " Welcome to Java ";
        System.out.println("This is Input method " +var);
    }
    public void CheckEligibility(int age){
        if(age>18){
            System.out.println("Eligible for Voting");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
    public void MakeSquare(int number){
        int result=number*number;
        System.out.println("Square of given number is "+result);
    }
    public void test(String name,int age){
        System.out.println("Name is "+name);
        System.out.println("Age is "+ age);
    }
    public void school(String name){
        System.out.println("Name of school is "+name);
    }
    public void section(String name, double marks){
        System.out.println("Name is "+name);
        System.out.println("Marks "+marks);
    }

    public static void main(String[] args) {
        InputVariable obj=new InputVariable();
        obj.input("Rinku");
        obj.CheckEligibility(23);
        obj.MakeSquare(10);
        obj.test("Akshay",27);
        obj.school("DAV");
        obj.section("Raghu",56.5);
    }
}
