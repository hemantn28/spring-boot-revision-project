package set;

import model.Employee;

import java.util.HashSet;

public class SetEmployee {
    public void createSet(){
        HashSet<Employee> employeeHashSet=new HashSet<>();

        Employee employee1=new Employee("Sumit",65326,"Sales");
        System.out.println(employee1.hashCode());
        Employee employee2=new Employee("Sumit",65326,"Sales");
        System.out.println(employee2.hashCode());
        Employee employee3=new Employee("Meenal",75326,"Advertising");
        Employee employee4=new Employee("Shri",75326,"Advertising");
        System.out.println(employee4.hashCode());

        employeeHashSet.add(employee1);
        employeeHashSet.add(employee2);
        employeeHashSet.add(employee3);
        employeeHashSet.add(employee4);

        for (Employee var: employeeHashSet){
            System.out.println("printing employee object "+var.getName()+"Hashcode "+var.hashCode());

        }
    }

    public static void main(String[] args) {
        SetEmployee obj=new SetEmployee();
        obj.createSet();
    }
    
}
