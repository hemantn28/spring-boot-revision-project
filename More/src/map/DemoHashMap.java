package map;

import java.util.HashMap;

public class DemoHashMap {
    public void createHashMap(){
        //syntax: CollectionName<Datatype_Key,Datatype_value> objName=new CollectionName(){CODE}
        HashMap<Integer, String> myHashmap=new HashMap<>();

        myHashmap.put(1,"Suresh");
        myHashmap.put(2,"Ashish");
        myHashmap.put(3,"Manish");
        myHashmap.put(4,"Kapil");
        myHashmap.put(5,"Saurabh");
        myHashmap.put(5,"Krishna");


        //getting an element
        System.out.println(myHashmap);
        System.out.println(myHashmap.get(5));
        System.out.println(myHashmap.remove(2));
        System.out.println(myHashmap);

        for (Integer var: myHashmap.keySet()){
            System.out.println("Printing Map "+myHashmap.get(var));
        }
    }

    public static void main(String[] args) {
        DemoHashMap obj=new DemoHashMap();
        obj.createHashMap();
    }
}

