package class_and_object;

public class Student {

    //data member
    String name;
    String section;
    int age;

    //parameterised constructor

    public Student(String name, String section, int age) {
        this.name = name;
        this.section = section;
        this.age = age;
    }

    public static void main(String[] args) {
        //creating object: Classname objectname=new Classname(value1,value2,value3...);

        Student obj=new Student("Ravi","IT",20);
        System.out.println(obj.name+ obj.section+ obj.age);

        Student obj1=new Student("Brajesh","Bio",19);
        System.out.println(obj1.name+" "+obj1.section+" "+obj1.age);

        
    }
}
