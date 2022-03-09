package methodswithinput;

public class Input {
    //syntax:access_specifier return type method_name(input parameter){CODE}
    public void mobile(String name){

        String var=name +" Welcome to Agra ";

        System.out.println("This is mobile method "+var);
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
    public void test(String name, int age){
        System.out.println("Name is "+ name);
        System.out.println("Age is "+age);
    }


    public static void main(String[] args) {
        Input obj=new Input();
        obj.mobile("Himanshu");
        obj.CheckEligibility(21);
        obj.MakeSquare(5);
        obj.test("Kamal",26);

    }
}
