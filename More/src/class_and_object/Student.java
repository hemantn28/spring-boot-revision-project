package class_and_object;

public class Student {
    String name;
    int rollNo;
    String section;

    //parameterized constructor


    public Student(String name, int rollNo, String section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    public static void main(String[] args) {
        Student obj=new Student("Gagan",11,"D");
        System.out.println(obj.name+ " " +obj.rollNo+" "+obj.section);

        Student obj2=new Student("Ambar",3,"C");
        System.out.println(obj2.name+" "+obj2.rollNo+" "+obj2.section);


    }
}
