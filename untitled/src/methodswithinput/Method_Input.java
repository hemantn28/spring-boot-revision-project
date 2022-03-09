package methodswithinput;

public class Method_Input {
    //syntax: access_simplifier return_type method_name(input parameter){CODE}

    public void message(String name){
        String var=name + " Welcome to Java ";
        System.out.println("This is message method "+var);
    }
    public void checkEligibility(int age){
        if(age>18){
            System.out.println("Eligible for voting");
        }
        else{
            System.out.println("Not eligible for voting");
        }
    }
    public void MakeSquare(int number){
        int result=number*number;
        System.out.println("Square of given number is "+result);
    }
    public void test(String name,int age){
        System.out.println("Name is "+name);
        System.out.println("Age is"+age);
    }
    public static void main(String[] args) {
        Method_Input obj=new Method_Input();
        obj.message("Wahid");
        obj.checkEligibility(19);
        obj.MakeSquare(3);
        obj.test("Wahid",24);
    }

}
