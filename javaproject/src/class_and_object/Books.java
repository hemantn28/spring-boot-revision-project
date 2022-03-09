package class_and_object;

public class Books {

    //data memeber
    String name="Java";
    int pages=340;
    String author="James Gosling";


    public static void main(String[] args) {

        //creating object : ClassName object_name= new ClassName();

        Book obj1 = new Book();

        System.out.println(obj1.name);
        System.out.println(obj1.pages);
        System.out.println(obj1.author);

    }

}
