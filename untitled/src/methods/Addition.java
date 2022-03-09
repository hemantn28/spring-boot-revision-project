package methods;

public class Addition {

    //addition
    //SYNTAX: access_simplifier return_type method_name(parameter){CODE}

    public void addition(){
        int a=2;
        int b=5;
        int result=a+b;

        System.out.println("Addition is "+result);
    }

    public static void main(String[] args) {
        Addition obj=new Addition();
        obj.addition();
    }
}
