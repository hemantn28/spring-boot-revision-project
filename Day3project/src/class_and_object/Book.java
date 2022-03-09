package class_and_object;

public class Book {
    //data member
    String name="Vivekanand";
    int pages=146;
    String writer="Roma Rolland";

    public static void main(String[] args) {

        //creating object= Classname object_name=new Classname();
        Book obj=new Book();
        System.out.println(obj.name+ obj.pages+ obj.writer);

        Book obj1=new Book();
        System.out.println(obj1.name+" "+obj1.pages+" "+obj1.pages);

    }
}
