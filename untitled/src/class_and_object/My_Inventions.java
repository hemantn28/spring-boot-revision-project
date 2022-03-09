package class_and_object;

public class My_Inventions {
    //data member
    String name="My Inventions";
    int pages=78;
    String author="Nikola Tesla";

    public static void main(String[] args) {
        //creating objects: Classname objectname=new Classname();
        My_Inventions obj=new My_Inventions();
        System.out.println(obj.name);
        System.out.println(obj.pages);
        System.out.println(obj.author);


    }
}
