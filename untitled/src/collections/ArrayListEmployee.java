package collections;

import java.util.ArrayList;

public class ArrayListEmployee {
    public void createList(){
        //syntax: CollectionName<Datatype> objname=new CollectionName();

        ArrayList<Employee> employeeArrayList=new ArrayList<>();

        //create object of employee class

        Employee employee1=new Employee("Rahul","Sales",65326.20);
        Employee employee2=new Employee("Ramesh","IT",75632.5);
        Employee employee3=new Employee("Rohit","Advertising",68632.5);

        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);

        for(Employee var: employeeArrayList){
            System.out.println("printing employee ArrayList "+var.getName());
            System.out.println("printing employee ArrayList "+var.getDepartment());
            System.out.println("printing employee ArrayList "+var.getSalary());
        }

    }

    public static void main(String[] args) {
        ArrayListEmployee obj=new ArrayListEmployee();
        obj.createList();
    }
}
