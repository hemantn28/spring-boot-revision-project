package class_and_object;

public class Gaban {
    //data member
    String name="Gaban";
    int pages=240;
    String writer="Premchand";

    public static void main(String[] args) {
        //creating object: Classname objectname=new Classname();
        Gaban obj=new Gaban();
        System.out.println(obj.name);
        System.out.println(obj.pages);
        System.out.println(obj.writer);
    }
}
