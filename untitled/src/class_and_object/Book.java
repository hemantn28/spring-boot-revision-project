package class_and_object;

public class Book {
    //data member
    String name="Can't hurt me";
    int pages=306;
    String author="David Goggins";

    public static void main(String[] args) {
        //creating object: Classname objectname=new Classname();
        Book obj=new Book();
        System.out.println(obj.name);
        System.out.println(obj.pages);
        System.out.println(obj.author);
    }

}
