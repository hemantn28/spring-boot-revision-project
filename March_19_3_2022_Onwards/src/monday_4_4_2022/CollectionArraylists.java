package monday_4_4_2022;

import java.util.ArrayList;

public class CollectionArraylists {
    public void createList(){
        ArrayList<Student> studentArrayList=new ArrayList<>();

        Student st1=new Student("Raj",54,"IT");
        Student st2=new Student("Rajesh",56,"CS");
        Student st3=new Student("Bittoo",6,"ME");

        studentArrayList.add(st1);
        studentArrayList.add(st2);
        studentArrayList.add(st3);

        for (Student var: studentArrayList){
            System.out.println(var.getName()+" "+var.getRollNo()+" "+var.getSection());

        }
        ArrayList<Employee> employeeArrayList=new ArrayList<>();

        Employee emp1=new Employee("Akash",23,"Sales");
        Employee emp2=new Employee("Mukesh",24,"IT");
        Employee emp3=new Employee("Nitin",25,"Accounting");

        employeeArrayList.add(emp1);
        employeeArrayList.add(emp2);
        employeeArrayList.add(emp3);

        for (Employee var: employeeArrayList){
            System.out.println(var.getName()+" "+var.getAge()+" "+var.getDeptt());
        }
    }

    public static void main(String[] args) {
        CollectionArraylists obj=new CollectionArraylists();
        obj.createList();

    }
}
