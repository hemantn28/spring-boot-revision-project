package methodswithinput;

public class MethodWithInput {
    //syntax: access_simplifier return_type method_name(input parameter){CODE}

    public void message(String name){

        String var=name +" Welcome to Java ";
        System.out.println("This is message method " +var);
    }
    public void checkEligibility(int age){

        if(age>18){
            System.out.println("Eligible for voting");
        }
        else{
            System.out.println("Not Eligible");
        }

    }
    public void MakeSquare(int number){
        int result=number*number;
        System.out.println("Square of given number is "+result);
    }
    public void test(String name, int age){
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
    }

    public static void main(String[] args) {
        MethodWithInput obj=new MethodWithInput();
        obj.message("Rahul");
        obj.checkEligibility(19);
        obj.MakeSquare(3);
        obj.test("Hariom",23);
    }


}
