package class_object;

public class English {

    //data member

    String name="Vishal";
    int marks=76;
    String subject="English";

    public static void main(String[] args) {

        //creating object= ClassName object_name=new ClassName();

        English obj1=new English();

        System.out.println(obj1.name+" "+obj1.marks+" "+obj1.subject);

        English obj2=new English();

        System.out.println(obj2.name+" "+obj2.marks+" "+obj2.subject);

        English obj3=new English();

        System.out.println(obj3.name+" "+obj3.marks+" "+obj3.subject);

    }

}
