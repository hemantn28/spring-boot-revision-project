package tuesday_5_4_2022;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String,Integer> empIds=new HashMap<>();

        empIds.put("Vikas",1452);
        empIds.put("Sivam",9234);
        empIds.put("Rahul",4127);
        empIds.put("Mayank",6073);

        System.out.println(empIds);

        System.out.println(empIds.get("Mayank"));

        System.out.println(empIds.containsKey("Ram"));
        System.out.println(empIds.containsValue(5013));

        empIds.put("Vikas",8520);
        System.out.println(empIds);

        empIds.replace("Sivam",4512);
        System.out.println(empIds);

        empIds.replace("Rana",4512);
        System.out.println(empIds);

        empIds.putIfAbsent("Yash",5087);
        System.out.println(empIds);

        empIds.remove("Vikas");
        System.out.println(empIds);


    }
}
