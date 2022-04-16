package saturday_9_4_2022;

import java.util.HashMap;

public class DemoHashMap {
    public void createHashMap(){
        //Syntax:Collection_Name<Datatype_Key,Datatype_String>Object_Name=new Collection_Name<>();
        HashMap<Integer,String> integerStringHashMap=new HashMap<>();

        //adding element to map
        integerStringHashMap.put(1,"Ravi");
        integerStringHashMap.put(2,"Vikas");
        integerStringHashMap.put(3,"Mohan");
        integerStringHashMap.put(4,"Ankur");
        integerStringHashMap.put(5,"Imran");
        integerStringHashMap.put(6,"Sonu");
        integerStringHashMap.put(7,"Ambar");
        integerStringHashMap.put(7,"Bunty");

        //getting element from map
       // System.out.println(integerStringHashMap.get(7));

        //delete element from map.
      /*  integerStringHashMap.remove(4);
        System.out.println(integerStringHashMap);*/

       /* integerStringHashMap.keySet();//returns set of all keys of map.
        System.out.println(integerStringHashMap.keySet());*/

        //loop
        for (Integer var:integerStringHashMap.keySet()){
            System.out.print(integerStringHashMap.get(var));
            System.out.print(",");
        }

    }

    public static void main(String[] args) {
        DemoHashMap demoHashMap=new DemoHashMap();
        demoHashMap.createHashMap();
    }
}
