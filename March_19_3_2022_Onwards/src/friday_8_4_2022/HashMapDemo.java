package friday_8_4_2022;

import java.util.HashMap;

public class HashMapDemo {
    public void createHashMap(){
        //Syntax:Collection_Name<Datatype_Key , Datatype_Value> Obj_Name=new Collection_Name<>();
        HashMap<Integer,String> empIds=new HashMap<>();

        //adding element to map
        empIds.put(17400,"Hemant");
        empIds.put(17480,"Ashish");
        empIds.put(17420,"Shubham");
        empIds.put(5618,"Saurabh");
        empIds.put(11547,"Naveen");
        empIds.put(7653,"Sanjay");
        empIds.put(7653,"Kapil");

        //Getting element from map.
        System.out.println(empIds.get(5618));


        //delete element
        empIds.remove(11547);
        System.out.println(empIds);

        //loop
        for (Integer var:empIds.keySet()){
            System.out.println(empIds.get(var));
        }
    }

    public static void main(String[] args) {
        HashMapDemo hashMapDemo=new HashMapDemo();
        hashMapDemo.createHashMap();
    }

}
