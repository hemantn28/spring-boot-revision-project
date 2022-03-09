import class_and_object.Book;

public class Bookss {

    //data member
    String name="Java";
    int pages=340;
    String writer="James Gosling";

    public static void main(String[] args) {

        //creating object : ClassName object_name= new ClassName ();

        Book obj1 = new Book();

        System.out.println(obj1.name);
        System.out.println(obj1.pages);
        System.out.println(obj1.writer);
    }



}
