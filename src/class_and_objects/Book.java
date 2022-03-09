package class_and_objects;

public class Book {
    //data member
    String BookName="Swami Vivekanand";
    int pages=340;
    String Author="Narendra Kohli";

    public static void main(String[] args) {
        //create object: ClassName ObjectName=new ClassName();
        Book obj=new Book();
        System.out.println("Printing Bookname: "+obj.BookName);
        System.out.println("Printing Pages: "+obj.pages);
        System.out.println("Printing AuthorName: "+obj.Author);

    }
}
