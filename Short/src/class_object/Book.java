package class_object;

public class Book {

    //data member
    String name="theory Of Relativity";
    int page=250;
    String writer="Albert Einstein";

    //methods
    //read
    //write

    //SYNTAX : access_specifier return_type method_name (parameter) {CODE}
    //read
    public void read(){
        System.out.println("This is read method");
    }
    //write
    public void write(){
        System.out.println("This is write method");

    }

    public static void main(String[] args) {

        //creating object : ClassName object_name=new ClassName();

        Book obj1 = new Book();
        obj1.read();
        obj1.write();
        System.out.println(obj1.name);
        System.out.println(obj1.page);
        System.out.println(obj1.writer);

        Book obj2 = new Book();

        System.out.println(obj2.name);
        System.out.println(obj2.page);
        System.out.println(obj2.writer);







    }
}
