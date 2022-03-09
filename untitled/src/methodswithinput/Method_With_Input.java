package methodswithinput;

public class Method_With_Input {
    //syntax: access_specifier return_type method_name(input parameter){CODE}
    public void message(String name){

        String var=name + " Welcome to java ";
        System.out.println("This is message method "+var);
    }

    public void checkEligibility(int age){
        if (age>18){
            System.out.println("Eligible for voting...");
        }
        else {
            System.out.println("Not eligible...");
        }
    }
    public void makesquare(int number){
        int result=number*number;
        System.out.println("Square of given number is "+result);
    }
    public void test(String name,int age){
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
    }

    public static void main(String[] args) {
        Method_With_Input obj=new Method_With_Input();
        obj.message("Rahul");
        obj.checkEligibility(21);
        obj.makesquare(31);
        obj.test("Vikas",23);
    }
}
