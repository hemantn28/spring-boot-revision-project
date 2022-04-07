package tuesday_5_4_2022;

import java.util.HashMap;

public class Demo_HashMap {
    public void createHashmap(){
        //syntax: Hashmap<datatype_key, datatype_value> obj_name=new Hashmap<>();

        HashMap<Integer,String>myHashmap=new HashMap<>();

        //adding element to map
        myHashmap.put(1,"java");
        myHashmap.put(2,"springboot");
        myHashmap.put(3,"microservices");
        myHashmap.put(3,"cloud");

        //getting element from map
        myHashmap.keySet();
        System.out.println(myHashmap.keySet());

        //System.out.println(myHashmap.get(3));

       /* for (Integer var:myHashmap.keySet()){
            System.out.println(myHashmap.get(var));
        }*/

        //deleting an element
       /* myHashmap.remove(1);
        System.out.println(myHashmap);*/

    }

    public static void main(String[] args) {
        Demo_HashMap hashMap=new Demo_HashMap();
        hashMap.createHashmap();
    }
}
