package class_and_object;

public class Ready_To_Fire {
    //data member
    String name="Ready To Fire";
    int pages=291;
    String author="Nambi Narayanan";

    public static void main(String[] args) {
        //creating objects: Clasname objectname=new Classname();
        Ready_To_Fire obj=new Ready_To_Fire();
        System.out.println(obj.name+obj.pages+obj.author);
    }
}
