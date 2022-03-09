package object;

public class Book {
    //data member
    String name;
    int price;
    String author;
    
    //todo syntax: access specifier return_type method_name(parameter){CODE}
    
    //capabilities
    //read
    public void read(){
        System.out.println("This is read method");
    }
    //write
    public void write(){
        System.out.println("This is write method");
    }

    public static void main(String[] args) {
        Book copy=new Book();
        copy.read();
        copy.write();
    }
}
