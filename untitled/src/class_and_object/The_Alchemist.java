package class_and_object;

public class The_Alchemist {
    //data member
    String name="The alchemist";
    int pages=73;
    String author="Paulo Coelho";

    public static void main(String[] args) {
        //creating objetcs: Classname objectname=new Clasname();
        The_Alchemist obj=new The_Alchemist();
        System.out.println(obj.name);
        System.out.println(obj.pages);
        System.out.println(obj.author);
    }
}
