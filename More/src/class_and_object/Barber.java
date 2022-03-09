package class_and_object;

public class Barber {
    String name;
    int staffno;

    //parameterized constructor

    public Barber(String name, int staffno) {
        this.name = name;
        this.staffno = staffno;
    }

    public static void main(String[] args) {
        Barber obj=new Barber("Javed Habib",10);
        System.out.println(obj.name+" "+obj.staffno);

        Barber obj2=new Barber("Shehnaz",16);
        System.out.println(obj2.name+" "+obj2.staffno);

    }
}
