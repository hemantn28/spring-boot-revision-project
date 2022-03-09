package class_object;


public class Books {

    //data member
    String bookname="Rajyog";
    int pages=40;
    String author="Swami vivekanand";

    public static void main(String[] args) {

        //creating object: Classname objectname=new Classname();

        Books obj=new Books();
        System.out.println(obj.bookname+" " +obj.pages+" "+obj.author);
    }

}
