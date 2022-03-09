package class_and_object;

public class Read_Book {

    //data member
    String name="Furiously Happy";
    int pages=308;
    String writer="Jenny Lawson";

    public static void main(String[] args) {
        //creating object: Classname objectname=new Classname();
        Read_Book obj=new Read_Book();
        System.out.println(obj.name);
        System.out.println(obj.pages);
        System.out.println(obj.writer);
    }


}
