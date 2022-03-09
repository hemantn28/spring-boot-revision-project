package method_and_object;

public class DemoReturnType {
    //syntax: access_specifier retun_type method_name(parameter){CODE}
    //CREATE A METHOD WHICH WILL RETURN STRING MESSAGE

    public String message(){

        String test="Java";

        return test;
    }
    //create a method which will give output as age
    public int getage(){
        int age=23;
        return age;
    }
    //create a method which will make square of given num.
    public int makesquare(int num){
        int square=num*num;
        return square;

    }

    public static void main(String[] args) {
        DemoReturnType obj=new DemoReturnType();
        String var=obj.message();
        System.out.println("output of message method is "+var);
        int age=obj.getage();
        System.out.println("Age  is "+age);
        int square=obj.makesquare(5);
        System.out.println("Square is "+square);
    }

}
