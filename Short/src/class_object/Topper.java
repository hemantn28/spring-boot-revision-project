package class_object;

public class Topper {

    String name;
    double percentage;
    String school;

    public Topper(String name, double percentage, String school) {
        this.name = name;
        this.percentage = percentage;
        this.school = school;
    }

    public static void main(String[] args) {

        //creating object: Classname object_name=new Classname(value1,value2,value3...);

        Topper obj=new Topper("Vivek",75.6,"Cambridge School");
        System.out.println(obj.name+ obj.percentage+ obj.school);

        Topper obj1=new Topper("Kavita",79.3,"DPS");
        System.out.println(obj1.name+obj1.percentage+obj1.school);

        Topper obj2=new Topper("Sameer",82.9,"DAV");
        System.out.println(obj2.name+obj2.percentage+obj2.school);

        Topper obj3=new Topper("Ahmed",85.1,"Oxford");
        System.out.println(obj3.name+obj3.percentage+obj3.school);

        Topper obj4=new Topper("John",87.4,"OLF");
        System.out.println(obj4.name+" "+obj4.percentage+" "+obj4.school);

        Topper obj5=new Topper("Jaspreet",89.6,"Modern School");
        System.out.println(obj5.name+" "+obj5.percentage+" "+obj5.school);




    }
}
