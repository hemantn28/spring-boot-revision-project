package class_and_object;

public class Sapiens {
    //data member
    String name="Sapiens";
    int pages=388;
    String author="Yuval Noah Harari";

    public static void main(String[] args) {
        //creating object= Classname objectname=new Classname();
        Sapiens obj=new Sapiens();
        System.out.println(obj.name+" "+obj.pages+" "+obj.author);
    }
}
