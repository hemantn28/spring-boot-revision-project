package tuesday_5_4_2022;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("a",10);
        map.put("b",20);
        map.put("c",30);

        System.out.println("size of map is: "+map.size());
        System.out.println(map);

        for (String var:map.keySet()){
            System.out.println(var+" "+map.get(var));
        }

    }
}
