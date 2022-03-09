package class_object;

public class Student {

    String name;
    int age;
    String section;

    //parameterised constructor

    public Student(String name, int age, String section) {
        this.name = name;
        this.age = age;
        this.section = section;
    }

    //method
    //study
    public void study() {
        System.out.println("This is study method");

    }
    //play
    public void play(){
        System.out.println("This is play method");
    }
    public static void main(String[] args) {

        //creating object : ClassName object_name=new ClassName(value1,value2,value3...);

        Student student1= new Student ("Rahul",21,"IT");
        student1.study();
        student1.play();

        System.out.println(student1.name+" " +student1.age+" " +student1.section);

        Student student2= new Student("Ajeet",21,"CS");

        System.out.println(student2.name+" " +student2.age+" "+student2.section);



    }
}
