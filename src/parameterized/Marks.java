package parameterized;

public class Marks {
    String name;
    int marks;

    public Marks(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public static void main(String[] args) {
        Marks obj=new Marks("Shyam",87);
        System.out.println("printing name: "+obj.name);
        System.out.println("printing marks: "+obj.marks);

        Marks obj2=new Marks("Kartik",79);
        System.out.println("printing name: "+obj2.name);
        System.out.println("printing marks: "+obj2.marks);

        Marks obj3=new Marks("Kanta",69);
        System.out.println("printing name: "+obj3.name);
        System.out.println("printing marks: "+obj3.marks);

        Marks obj4=new Marks("Vinit",64);
        System.out.println("printing name: "+obj4.name);
        System.out.println("printing marks: "+obj4.marks);
    }
}
