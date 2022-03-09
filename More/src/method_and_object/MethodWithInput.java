package method_and_object;

public class MethodWithInput {
    //syntax: access_specifier return_type method_name(input parameter){CODE}

    public void message(String name){

        String var=name+ " Welcome to Java";
        System.out.println("This is message method "+var);
    }
    public void checkEligibility(int age){
        if(age>18){
            System.out.println("eligible for voting");
        }
        else{
            System.out.println("not eligible");
        }

    }
    public void makesquare(int number){
        int result=number*number;
        System.out.println("square is "+result);
    }
    public void test(String name,int age){
        System.out.println("name is "+name);
        System.out.println("age is "+age);

    }

    public static void main(String[] args) {
        MethodWithInput obj=new MethodWithInput();
        obj.message("Rahul");
        obj.checkEligibility(19);
        obj.makesquare(5);
        obj.test("John",27);
    }
}
