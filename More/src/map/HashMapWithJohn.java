package map;


import java.util.HashMap;

public class HashMapWithJohn {
    public static void main(String[] args) {
        //syntax: CollectionName<Datatype_key, Datatype_value> obj_name=new CollectionName(){CODE}

        HashMap<String, Integer>  empIds=new HashMap<>();

        empIds.put("Vikas",5628);
        empIds.put("Sachin",8412);
        empIds.put("Rakesh",1457);
        empIds.put("Harish",9831);
        empIds.put("shikha",4703);

        System.out.println(empIds);
        System.out.println(empIds.get("Rakesh"));
        System.out.println(empIds.containsKey("Hari"));
        System.out.println(empIds.containsValue(9831));

        empIds.put("Vikas",8149);
        System.out.println(empIds);

        empIds.replace("Piyush",4108);
        System.out.println(empIds);

        empIds.putIfAbsent("Sameer",457);
        System.out.println(empIds);

        empIds.remove("Sachin");
        System.out.println(empIds);


    }
}
