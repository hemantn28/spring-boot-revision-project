package Thursday_7_4_2022;

import java.util.HashSet;

public class BookHashSet {
    public void createHashSet(){
        //Syntax: Collection_Name<Datatype> Object_name=new collection_Name<>();

        HashSet<Book> bookHashSet=new HashSet<>();

        Book book1=new Book("Can't Hurt Me","David Goggins",340,250.50);
        Book book2=new Book("Swami Vivekanand","Narendra Kohli",350,150.50);
        Book book3=new Book("Ramcharit Manas","Tulsidas",1250,350.55);
        Book book4=new Book("Can't Hurt Me","David Goggins",340,250.50);

        bookHashSet.add(book1);
        bookHashSet.add(book2);
        bookHashSet.add(book3);
        bookHashSet.add(book4);

        for (Book var:bookHashSet){
            System.out.println(var.getName()+","+var.getAuthor()+","+var.getPages()+","+var.getPrice());
        }
    }

    public static void main(String[] args) {
        BookHashSet bookHashSet=new BookHashSet();
        bookHashSet.createHashSet();
    }
}
