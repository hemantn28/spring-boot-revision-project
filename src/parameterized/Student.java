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
        Student obj=new Student("Rahul",45,"C");
        System.out.println(obj.name);
        System.out.println(obj.rollNo);
        System.out.println(obj.section);

        Student obj1=new Student("Vinod",63,"D");
        System.out.println(obj1.name);
        System.out.println(obj1.rollNo);
        System.out.println(obj1.section);

        Student obj2=new Student("Neha",27,"A");
        System.out.println(obj2.name);
        System.out.println(obj2.rollNo);
        System.out.println(obj2.section);
    }
}
