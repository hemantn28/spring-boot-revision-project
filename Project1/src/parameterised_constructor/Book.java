package parameterised_constructor;

public class Book {
    String name;
    int pages;
    String author;

    public Book(String name, int pages, String author) {
        this.name = name;
        this.pages = pages;
        this.author = author;
    }

    public static void main(String[] args) {
        Book obj=new Book("Godan",65,"Munshi Premchnad");
        System.out.println("Book: "+obj.name);
        System.out.println("Pages: "+obj.pages);
        System.out.println("Author: "+obj.author);

        Book obj1=new Book("Science",167,"Manjeet Kaur");
        System.out.println("Book: "+obj1.name);
        System.out.println("Pages: "+obj1.pages);
        System.out.println("Author: "+obj1.author);

        Book obj2=new Book("Ramayan",1090,"Tulsidas");
        System.out.println("Book: "+obj2.name);
        System.out.println("Pages: "+obj2.pages);
        System.out.println("Author: "+obj2.author);

        Book obj3=new Book("My Geeta",250,"Devdutt Pattnaik");
        System.out.println("Book: "+obj3.name);
        System.out.println("Pages: "+obj3.pages);
        System.out.println("Author: "+obj3.author);

    }
}
