package saturday_9_4_2022;

import java.util.HashMap;

public class HashMap_John {
    public static void main(String[] args) {
        HashMap<String,Integer> empIds=new HashMap<>();

        empIds.put("Shivam",5684);
        empIds.put("Vikas",3195);
        empIds.put("Sonu",9014);
        empIds.put("Abhishek",1254);
        empIds.put("Mohit",7684);

        System.out.println(empIds);

        System.out.println(empIds.get("Vikas"));

        System.out.println(empIds.containsKey("Tinku"));
        System.out.println(empIds.containsValue(9014));
        empIds.put("Shivam",1637);
        System.out.println(empIds);
        System.out.println(empIds.replace("Sonu",5802));
        System.out.println(empIds);
        System.out.println(empIds.put("Manish",6049));
        System.out.println(empIds);
        System.out.println(empIds.putIfAbsent("Karan",546));
        System.out.println(empIds);
        System.out.println(empIds.remove("Abhishek"));
        System.out.println(empIds);

    }
}
