package returntype;

public class Return_Demo_Type {
    public String message(){
        String name="Rahul";
        return name;
    }
    public int getage(){
        int age=25;
        return age;
    }
    public int makesquare(int number){
        int square=number*number;
        return square;
    }

    public static void main(String[] args) {
        Return_Demo_Type obj=new Return_Demo_Type();
        String var=obj.message();
        System.out.println("Output of message method is "+var);

        int age=obj.getage();
        System.out.println("Age is "+age);

        int square=obj.makesquare(10);
        System.out.println("Square of given number is "+square);
    }
}
