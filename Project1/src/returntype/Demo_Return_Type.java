package returntype;

public class Demo_Return_Type {
    //syntax: access_simplifier return_type method_name(parameter){CODE}

    public String school(){
        String subject="Java";
        return subject;
    }
    public double getmarks(){
        double marks=67.5;
        return marks;
    }

    public int getage(){
        int age=26;
        return age;
    }

    public int makesquare(int number){
        int square=number*number;
        return square;
    }

    public int makecube(int number){
        int cube=number*number*number;
        return cube;
    }
    public double height(){
        double height=6.2;
        return height;
    }
    public double distance(){
        double distance=85.3;
        return distance;
    }

    public static void main(String[] args) {
        Demo_Return_Type abc=new Demo_Return_Type();
        String subject=abc.school();
        System.out.println("Output of school method is "+subject);

        double marks=abc.getmarks();
        System.out.println("Marks are "+marks);

        int age=abc.getage();
        System.out.println("Age is "+age);

        int cube= abc.makecube(9);
        System.out.println("Cube of given number is"+cube);

        int square= abc.makesquare(11);
        System.out.println("Square of given number is "+square);

        double height=abc.height();
        System.out.println("Height is "+height);

        double distance= abc.distance();
        System.out.println("Distance is "+distance);
    }

}
