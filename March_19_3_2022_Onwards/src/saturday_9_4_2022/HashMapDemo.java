package saturday_9_4_2022;

import java.util.HashMap;

public class HashMapDemo {
    public void createHashMap() {
        //Syntax:Collection_Name<Datatype_Key, Datatype_Value> Object_Name=new Collection_Name<>();
        HashMap<Integer, String> hashMap = new HashMap<>();

        //adding elements to map.
        hashMap.put(1, "Python");
        hashMap.put(2, "Java");
        hashMap.put(3, "Javascript");
        hashMap.put(4, "HTML");
        hashMap.put(5, "Python");

        //get elements
        System.out.println(hashMap.get(4));
        System.out.println(hashMap.get(2));
        System.out.println(hashMap.get(3));

        hashMap.keySet();// returns set of all keys of map.
        System.out.println(hashMap.keySet());

        //Printing Thru Advance For Loop.
        System.out.println("Printing Thru Advance For Loop");
        for (Integer var: hashMap.keySet()){
            System.out.print(hashMap.get(var));
            System.out.print(", ");
        }
        System.out.println("\n");


    }


    public static void main(String[] args) {
        HashMapDemo hashMapDemo=new HashMapDemo();
        hashMapDemo.createHashMap();
    }
}
