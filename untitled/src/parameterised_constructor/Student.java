package parameterised_constructor;

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

    public static void main(String[] args) {
        //creating object: Classname objectname=new Classname(value1,value2,value3....);
        Student obj=new Student("vikas",20,"sociology");
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.section);

        Student obj1=new Student("rohit",21,"Anthropology");
        System.out.println(obj1.name+obj1.age+obj1.section);

        Student obj2=new Student("Neha",22,"CS");
        System.out.println(obj2.name+" "+obj2.age+" "+obj2.section);

        Student obj3=new Student("Parag",23,"Biotech");
        System.out.println(obj3.name);
        System.out.println(obj3.age);
        System.out.println(obj3.section);

        Student obj4=new Student("Susheel",24,"Social Science");
        System.out.println(obj4.name+obj4.age+obj4.section);

        Student obj5=new Student("Kamal",19,"History");
        System.out.println(obj5.name+" "+obj5.age+" "+obj5.section);

    }
}
