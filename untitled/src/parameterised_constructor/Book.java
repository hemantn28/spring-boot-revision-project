package parameterised_constructor;

public class Book {
    String name;
    int pages;
    String author;

    //parameterised constructor

    public Book(String name, int pages, String author) {
        this.name = name;
        this.pages = pages;
        this.author = author;
    }

    public static void main(String[] args) {
        //creating object: Classname objectname=new Classname();
        Book read=new Book("Bharat ki khoj",250,"Jwahar lal nehru");
        System.out.println(read.name);
        System.out.println(read.pages);
        System.out.println(read.author);

        Book write=new Book("My experiments with truth",300,"Mahatma Gandhi");
        System.out.println(write.name+write.pages+write.author);

        Book skip=new Book("India Today",40,"Arun Puri");
        System.out.println(skip.name+" "+skip.pages+" "+skip.author);
    }
}
