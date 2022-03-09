package collection_demo;

import model.Employee;

import java.util.ArrayList;

public class ArrayListEmployee {

    public void createList(){

        //syntax: CollectionName <DataType> Objname=new Collectionname();

        ArrayList<Employee> employeeArrayList= new ArrayList<>();

        //create object of employee

        Employee employee1=new Employee("Aakash",56321,"Sales");
        Employee employee2=new Employee("Prabhat",74236,"IT");
        Employee employee3=new Employee("Prakash",66521,"Accounting");

        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);

        for(Employee var:employeeArrayList){
            System.out.println("Printing Employee ArrayList "+var.getName());
            System.out.println("Printing Employee ArrayList "+var.getSalary());
            System.out.println("Printing Employee ArrayList "+var.getDeptt());
        }
    }

    public static void main(String[] args) {
        ArrayListEmployee obj=new ArrayListEmployee();
        obj.createList();
    }

}
