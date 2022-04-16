package saturday_9_4_2022;

import java.util.HashMap;

public class HashMapRandom_Exercise {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();

        map.put(45,"Roshan");
        map.put(54,"Deepak");
        map.put(69,"Manoj");
        map.put(74,"Naresh");
        map.put(87,"Murari");
        map.put(38,"Onkar");

        //get
        //System.out.println(map.get(87));

        //clear: is used to remove all items
        /*map.clear();
        System.out.println(map);*/

        //clone
        //System.out.println(map.clone());

        //size
       // map.size();
        //System.out.println(map.size());

        //System.out.println(map.keySet());

        /*map.keySet();
        System.out.println(map);*/

        //System.out.println(map.entrySet());

        //test if the given map contains a mapping for the specified key.
        /*System.out.println("\nThe original map: "+map);
        if (map.containsKey(50)){
            System.out.println("Yes Key exists in map ");
        }
        else{
            System.out.println("No, Key doesn't exist in map ");
        }*/

        //Write a Java program to get a shallow copy of a HashMap instance.
      /*  System.out.println("The original map "+map);
        System.out.println(map.clone());*/

        //create a set view of the mappings contained in a map.

       // System.out.println(map.entrySet());

        // get a set view of the keys contained in this map.
        //System.out.println(map.keySet());

        //get a collection view of the values contained in this map.

        System.out.println(map.values());
    }
}
