package method_and_object;

public class DemoReturnType1 {
    //syntax: access_specifier return_type method_name(parameter){CODE}

    //create a method which will return string message

    public String demo(){

        String test="Ramesh";

        return test;
    }
    //create a method which will give output as age

    public int checkAge(){

        int age=23;
        return age;
    }
    //create a method which will make square of given num.
    public int makesquare(int num){
        int square=num*num;
        return square;
    }
    //create a method which will make cube of given num.
    public int makecube(int num){
        int cube=num*num*num;
        return cube;
    }
    //create a method which will give u a string message

    public String city(){
        String destination="Ujjain";
        return destination;
    }
    public int finalmarks(){
        int marks=85;
        return marks;
    }

    public static void main(String[] args) {
        DemoReturnType1 obj=new DemoReturnType1();
        String test=obj.demo();
        System.out.println("Output of new method is "+test);
        int age=obj.checkAge();
        System.out.println("Age is "+age);
        int square= obj.makesquare(2);
        System.out.println("Square of given num is "+square);
        int cube=obj.makecube(8);
        System.out.println("cube is "+cube);
        String destination=obj.city();
        System.out.println("destination is "+destination);
        int marks=obj.finalmarks();
        System.out.println("marks is "+marks);
    }

}
