package parameterized;

public class Salary {
    String name;
    double salary;

    public Salary(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Salary obj=new Salary("Ram",98632.500);
        System.out.println("printing name "+obj.name);
        System.out.println("printing salary "+obj.salary);

        Salary obj1=new Salary("Krishna",90000.25);
        System.out.println("printing name "+obj1.name);
        System.out.println("printing salary "+obj1.salary);

        Salary obj2=new Salary("Lakhan",100236.50);
        System.out.println("printing name "+obj2.name);
        System.out.println("printing salary "+obj2.salary);

        Salary obj3=new Salary("Dashrath",125000.50);
        System.out.println("printing name "+obj3.name);
        System.out.println("printing salary "+obj3.salary);



    }
}
