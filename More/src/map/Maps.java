package map;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {

        HashMap<String,Integer> empIDs=new java.util.HashMap<>();

        empIDs.put("Vikas",12345);
        empIDs.put("Prem",54321);
        empIDs.put("Ashish",21453);

        System.out.println(empIDs);

        System.out.println(empIDs.get("Ashish"));
        System.out.println(empIDs.containsKey("Rakesh"));
        System.out.println(empIDs.containsValue(21453));

        empIDs.put("Vikas",12534);
        System.out.println(empIDs);

        empIDs.replace("Mukesh",777);
        System.out.println(empIDs);

        empIDs.putIfAbsent("Nishant",222);
        System.out.println(empIDs);

        empIDs.remove("Prem");
        System.out.println(empIDs);

    }


}
