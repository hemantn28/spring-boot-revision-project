package class_and_object;

public class Books {
    //data member
    String name="Everything Is possible";
    int pages=30;
    String writer="Jen Bricker";

    public static void main(String[] args) {
        //creating object: Classname objectname=new Classname();
        Books read=new Books();
        System.out.println(read.name+" "+read.pages+" "+read.writer);
    }
}
