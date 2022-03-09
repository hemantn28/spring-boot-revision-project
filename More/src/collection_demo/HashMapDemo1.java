package collection_demo;

import java.util.HashMap;

public class HashMapDemo1 {
    public void createHashMap(){
        //syntax:CollectionName<Datatype_key,Datatype_value>objName=new CollectionName();

        HashMap<Integer,String> map=new HashMap<>();

        //adding element to map

        map.put(1,"Ramesh");
        map.put(2,"Rishabh");
        map.put(3,"Rinku");
        map.put(3,"Rohan");

        //getting an element from map

        System.out.println(map.get(3));

        for(Integer var: map.keySet()){
            System.out.println("printing map "+map.get(var));
        }

        //remove/delete an element
        map.remove(1);
        System.out.println(map.get(1));

    }


    public static void main(String[] args) {
        HashMapDemo1 obj=new HashMapDemo1();
        obj.createHashMap();
    }
}
