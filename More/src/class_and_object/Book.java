package class_and_object;

public class Book {
    //data member
    String name="abc";
    int pages=63;
    String author="Axis";

    public static void main(String[] args) {

        //creating object
        Book obj=new Book();
        System.out.println(obj.name);
        System.out.println(obj.pages);
        System.out.println(obj.author);
    }
}
