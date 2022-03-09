package parameterized;

public class Book {
    String bookname;
    int pages;
    String author;

    public Book(String bookname, int pages, String author) {
        this.bookname = bookname;
        this.pages = pages;
        this.author = author;
    }

    public static void main(String[] args) {
        Book obj=new Book("Science",310,"Lakhbir Singh");
        System.out.println("printing bookname: "+obj.bookname);
        System.out.println("printing pages: "+obj.pages);
        System.out.println("printing author: "+obj.author);

        Book obj2=new Book("SST",390,"Kundra Bawa");
        System.out.println("printing bookname: "+obj2.bookname);
        System.out.println("printing pages: "+obj2.pages);
        System.out.println("printing author: "+obj2.author);

        Book obj3=new Book("Godan",60,"Premchand");
        System.out.println("printing bookname: "+obj3.bookname);
        System.out.println("printing pages: "+obj3.pages);
        System.out.println("printing author: "+obj3.author);

        Book obj4=new Book("Mein Kemph",325,"Adolf Hitler");
        System.out.println("printing bookname: "+obj4.bookname);
        System.out.println("printing pages: "+obj4.pages);
        System.out.println("printing author: "+obj4.author);




    }
}
