package class_and_object;

public class My_Geeta {
    //data member
    String name="My Geeta";
    int pages=156;
    String author="Devdutt Patnaik";

    public static void main(String[] args) {
        //creating object: Classname objectname=new Classname();
        My_Geeta obj=new My_Geeta();
        System.out.println(obj.name);
        System.out.println(obj.pages);
        System.out.println(obj.author);
    }
}
