package methodswithinput;

public class InputMethods {
    //syntax: access_specifier return_type method_name(input parameter){CODE}

    public void standard(String name){
        String var= name +" Welcome to India ";
        System.out.println("This is standard method "+var);
    }

    public void checkeligibility(int age){
        if(age>18){
            System.out.println("Eligible for voting");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
    public void test(String name,int age){
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
    }
    public void makecube(int number){
        int result=number*number*number;
        System.out.println("Cube of given number is "+ result);
    }

        public static void main(String[] args) {
        InputMethods obj=new InputMethods();
        obj.standard("Rana");
        obj.checkeligibility(19);
        obj.test("Hritik",35);
        obj.makecube(5);
    }
}
