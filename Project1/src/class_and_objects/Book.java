package class_and_objects;

public class Book {
    String name="Cant't Hurt Me";
    int pages=325;
    String author="David Goggins";

    public static void main(String[] args) {
        Book obj=new Book();
        System.out.println("printing bookname: "+obj.name);
        System.out.println("printing pages: "+obj.pages);
        System.out.println("printing authorname: "+obj.author);
    }

}
