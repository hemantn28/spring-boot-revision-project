package tuesday_5_4_2022;

import monday_4_4_2022.Employee;

import java.util.HashMap;

public class EmployeeHashMap {
    public void createHashMap(){
        //syntax: Hashmap<datatype_key, datatype_value> obj_name=new Hashmap<>();
        HashMap<Integer,Employee> employeeHashMap=new HashMap<>();

        Employee emp1=new Employee("Kamesh",25,"Sales");
        Employee emp2=new Employee("Sandeep",23,"IT");
        Employee emp3=new Employee("Hirdesh",24,"Accounting");
        Employee emp4=new Employee("Alok",21,"Backend");

        employeeHashMap.put(1,emp1);
        employeeHashMap.put(2,emp2);
        employeeHashMap.put(3,emp3);
        employeeHashMap.put(4,emp4);

        System.out.println(employeeHashMap.get(1).getName()+" "+employeeHashMap.get(1).getAge()+" "+employeeHashMap.get(1).getDeptt());
        System.out.println(employeeHashMap.get(2).getName()+" "+employeeHashMap.get(2).getAge()+" "+employeeHashMap.get(2).getDeptt());
        System.out.println(employeeHashMap.get(3).getName()+" "+employeeHashMap.get(3).getAge()+" "+employeeHashMap.get(3).getDeptt());
        System.out.println(employeeHashMap.get(4).getName()+" "+employeeHashMap.get(4).getAge()+" "+employeeHashMap.get(4).getDeptt());

        for (Integer var: employeeHashMap.keySet()){
            System.out.println(employeeHashMap.get(var).getName()+" "+employeeHashMap.get(var).getAge()+" "+employeeHashMap.get(var).getDeptt());
        }




    }

    public static void main(String[] args) {
        EmployeeHashMap obj=new EmployeeHashMap();
        obj.createHashMap();
    }
}
