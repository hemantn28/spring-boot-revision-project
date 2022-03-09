package class_and_object;

public class School {
    //data member
    String name="DAV";
    int age=75;
    String city="Chandigarh";

    public static void main(String[] args) {
        //creating object: Classname objectname=new Classname();
        School obj=new School();
        System.out.println(obj.name+obj.age+obj.city);
    }
}
