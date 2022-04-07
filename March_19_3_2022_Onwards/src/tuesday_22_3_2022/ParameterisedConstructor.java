package tuesday_22_3_2022;

class Book3{
    String name;
    int pages;
    double price;

    public Book3(String name, int pages, double price) {
        this.name = name;
        this.pages = pages;
        this.price = price;
    }
}

public class ParameterisedConstructor {
    public static void main(String[] args) {
        Book3 bk3=new Book3("Java",350,250.63);
        System.out.println(bk3.name+" "+bk3.pages+" "+bk3.price);

        Book3 bk4=new Book3("Swami Vivekanand",340,163.54);
        System.out.println(bk4.name+" "+bk4.pages+" "+bk4.price);

        Book3 bk5=new Book3("Can't Hurt Me",256,247.94);
        System.out.println(bk5.name+" "+bk5.pages+" "+bk5.price);



    }
}
