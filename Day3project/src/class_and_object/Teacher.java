package class_and_object;

public class Teacher {
    //data member
    String name="Lakhan Sir";
    String subject="History";
    int standard=6;

    public static void main(String[] args) {
        //creating objec: Classname objectname=new Classname();
        Teacher obj=new Teacher();
        System.out.println(obj.name);
        System.out.println(obj.subject);
        System.out.println(obj.standard);

        Teacher obj1=new Teacher();
        System.out.println(obj1.name+obj1.subject+obj1.standard);

        Teacher obj2=new Teacher();
        System.out.println(obj2.name+" "+obj2.subject+" "+obj2.standard);
    }
}
