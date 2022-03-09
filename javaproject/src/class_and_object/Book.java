package class_and_object;

public class Book {

    //data member
    public String name="Java";
     public int    pages= 98;
    public boolean writer;
    String author= "james";

    public static void main(String[] args) {

        // creating object : class name  object name= new classname ();

        Book obj1 = new Book ();
        System.out.println(obj1.name);
        System.out.println(obj1.pages);
        System.out.println(obj1.author);

        Book obj2 = new Book ();

        System.out.println(obj2.name);
        System.out.println(obj2.pages);
        System.out.println(obj2.author);

    }



}
