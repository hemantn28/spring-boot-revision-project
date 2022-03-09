package returntype;

public class DemoReturnType {
    //syntax: access_specifier return_type method_name (parameter){CODE}
    public String message(){
        String test="Java";
        return test;
    }
    public int getage(){
        int age=23;
        return age;
    }
    public int makesquare(int number){
        int square=number*number;
        return square;
    }
    public static void main(String[] args) {
        DemoReturnType obj=new DemoReturnType();
        String var=obj.message();

        System.out.println("Output of message method is "+var);

        int age=obj.getage();
        System.out.println("age is "+age);

        int square=obj.makesquare(5);
        System.out.println("Square of given number is "+square);



    }
}
