package Thursday_7_4_2022;

import lombok.Data;

@Data
public class Book {
    String name;
    String author;
    int pages;
    double price;

    public Book(String name, String author, int pages, double price) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }
}
