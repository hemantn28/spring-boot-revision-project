package parameterised_constructor;

public class School {
    String name;
    String city;
    int totalStudents;

    public School(String name, String city, int totalStudents) {
        this.name = name;
        this.city = city;
        this.totalStudents = totalStudents;
    }

    public static void main(String[] args) {
        School obj=new School("DAV","New Delhi",1000);
        System.out.println("School Name: "+obj.name);
        System.out.println("city: "+obj.city);
        System.out.println("totalStudents: "+obj.totalStudents);

        School obj1=new School("APS","Aligarh",1100);
        System.out.println("School Name: "+obj1.name);
        System.out.println("city: "+obj1.city);
        System.out.println("totalStudents: "+obj1.totalStudents);

        School obj2=new School("Cambridge","Ludhiana",2000);
        System.out.println("School Name: "+obj2.name);
        System.out.println("city: "+obj2.city);
        System.out.println("totalStudents: "+obj2.totalStudents);

        School obj3=new School("Modern","Delhi",3000);
        System.out.println("School Name: "+obj3.name);
        System.out.println("city: "+obj3.city);
        System.out.println("totalStudents: "+obj3.totalStudents);
    }
}
