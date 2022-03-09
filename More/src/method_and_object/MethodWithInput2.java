package method_and_object;

public class MethodWithInput2 {
    //syntax: access_specifier return_type method_name(input parameter){CODE}

    public void message(String name){

        String var=name+ " You are a good boy.";
        System.out.println("This is message method "+var);
    }
    public void checkdivision(int num){
        if(num>60){
            System.out.println("first division");
        }
        else if(num>45){
            System.out.println("second division");
        }
        else if(num>40){
            System.out.println("third division");
        }
        else{
            System.out.println("you are fail");
        }
    }
    public void makecube(int num){
        int result=num*num*num;
        System.out.println("cube is "+result);
    }
    public void intro(String name, int age){
        System.out.println("name is "+name);
        System.out.println("age is "+age);
    }

    public static void main(String[] args) {
        MethodWithInput2 obj=new MethodWithInput2();
        obj.message("Umesh");
        obj.checkdivision(38);
        obj.makecube(22);
        obj.intro("Abhinav",23);
    }
}
