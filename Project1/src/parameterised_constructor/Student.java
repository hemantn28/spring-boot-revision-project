package parameterised_constructor;

public class Student {
    String name;
    int rollno;
    String section;

    public Student(String name, int rollno, String section) {
        this.name = name;
        this.rollno = rollno;
        this.section = section;
    }

    public static void main(String[] args) {
        Student obj=new Student("Raj",41,"A");
        System.out.println("Student Name: "+obj.name);
        System.out.println("Roll No: "+obj.rollno);
        System.out.println("Section: "+obj.section);

        Student obj1=new Student("Rohit",45,"D");
        System.out.println("Student Name: "+obj1.name);
        System.out.println("Roll No: "+obj1.rollno);
        System.out.println("Section: "+obj1.section);

        Student obj2=new Student("Shivam",53,"E");
        System.out.println("Student Name: "+obj2.name);
        System.out.println("Roll No: "+obj2.rollno);
        System.out.println("Section: "+obj2.section);

        Student obj3=new Student("Mayank",20,"B");
        System.out.println("Student Name: "+obj3.name);
        System.out.println("Roll No: "+obj3.rollno);
        System.out.println("Section: "+obj3.section);

        Student obj4=new Student("Dinesh",11,"C");
        System.out.println("Student Name: "+obj4.name);
        System.out.println("Roll No: "+obj4.rollno);
        System.out.println("Section: "+obj4.section);




    }
}
