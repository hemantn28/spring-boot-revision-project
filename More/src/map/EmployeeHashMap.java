package map;

import model.EmployeeData;

import java.util.HashMap;

public class EmployeeHashMap {
    public void createmap(){
        //syntax: Collectionname<datatype_Key, Datatype_value> obj_name=new CollectionName(){CODE}

        HashMap<Integer, EmployeeData> employeeHashMap=new HashMap<>();

        //create object of employee1 model class.

        EmployeeData employee1=new EmployeeData("Kamesh",4125,"Sales");
        EmployeeData employee2=new EmployeeData("Nitesh",7316,"Accounting");
        EmployeeData employee3=new EmployeeData("Tinku",3107,"Marketing");

        //add
        employeeHashMap.put(4125,employee1);
        employeeHashMap.put(7316,employee2);
        employeeHashMap.put(3107,employee3);

        for (Integer var: employeeHashMap.keySet()){
            System.out.println("Printing Emp Map: "+employeeHashMap.get(var).getName());
            System.out.println("Printing Emp Map: "+employeeHashMap.get(var).getEmp_id() + " deptt: "+employeeHashMap.get(var).getDeptt());

        }
    }

    public static void main(String[] args) {
        EmployeeHashMap obj=new EmployeeHashMap();
        obj.createmap();
    }
}
