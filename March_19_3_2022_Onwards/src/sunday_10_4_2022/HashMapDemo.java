package sunday_10_4_2022;

import java.util.HashMap;

public class HashMapDemo {
    public void createHashmap(){

        //Syntax: Collection_Name<datatype_Key,Datatype_Value> Object_Name=new collection_Name<>();

        HashMap<Integer,String> myHashMap=new HashMap<>();

        myHashMap.put(54,"China");
        myHashMap.put(41,"India");
        myHashMap.put(80,"Myanmar");
        myHashMap.put(23,"Japan");
        myHashMap.put(45,"Vietnam");
        myHashMap.put(97,"Indonesia");

        //get method to access elements of a map.
        //System.out.println(myHashMap.get(41));

        //get the hashMap
       // System.out.println(myHashMap);

        //keyset=> returns set of all keys
        //myHashMap.keySet();
        //System.out.println(myHashMap.keySet());

        //loop
        for (Integer var: myHashMap.keySet()){
            System.out.print(myHashMap.get(var));
            System.out.print(",");
        }
        System.out.println("\n");







    }

    public static void main(String[] args) {


    HashMapDemo obj=new HashMapDemo();
    obj.createHashmap();
    }
}
