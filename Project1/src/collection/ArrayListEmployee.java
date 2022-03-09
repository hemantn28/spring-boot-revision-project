package collection;

import model.Employee;

import java.util.ArrayList;

public class ArrayListEmployee {

    public void creatrlist(){

        //syntax: collectionName<DataType>objName=new collectionname();

        ArrayList<Employee> employeeArrayList=new ArrayList<>();

        //create object of employee class

        Employee employee1=new Employee("Prakash","Sales",65321);
        Employee employee2=new Employee("Parag","Accounting",55321);
        Employee employee3=new Employee("Sachin","IT",75321);

        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);

        for(Employee var : employeeArrayList){
            System.out.println("Printing employee Arraylist "+var.getName());
            System.out.println("Printing employee Arraylist "+var.getDeptt());
            System.out.println("Printing employee Arraylist "+var.getSalary());
        }
    }

    public static void main(String[] args) {
        ArrayListEmployee obj=new ArrayListEmployee();
        obj.creatrlist();
    }
}
