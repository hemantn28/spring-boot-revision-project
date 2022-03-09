package class_object;

public class Sky {

    //data member
    String name="Godan";
    int pages=288;
    String author="Premchand";

    public static void main(String[] args) {

        //creating object: Classname object_name= new Classname();

        Sky obj1= new Sky();

        System.out.println(obj1.name);
        System.out.println(obj1.pages);
        System.out.println(obj1.author);

        Sky obj2= new Sky();

        System.out.println(obj2.name);
        System.out.println(obj2.pages);
        System.out.println(obj2.author);
    }





}
