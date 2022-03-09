package collection_demo;

import java.util.HashMap;

public class HashMapDemo {
    public void createHashMap(){
        //syntax:CollectionName<Datatype_key, Datatype_value> objname=new CollectionName();

        HashMap<Integer,String> myhashmap=new HashMap<>();

        //adding element to Map
        myhashmap.put(1,"Java");
        myhashmap.put(2,"Spring");
        myhashmap.put(3,"SpringBoot");
        myhashmap.put(3,"MicroService");

        //getting element from map
        System.out.println(myhashmap.get(3));

        for(Integer var: myhashmap.keySet()){
            System.out.println("printing map "+myhashmap.get(var));
        }

        //deleting an element
        myhashmap.remove(1);
        System.out.println(myhashmap.get(1));
    }

    public static void main(String[] args) {
        HashMapDemo obj=new HashMapDemo();
        obj.createHashMap();
    }
}
