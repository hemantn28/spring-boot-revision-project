package map;

import java.util.HashMap;

public class Marks {
    public static void main(String[] args) {
        HashMap<String,Integer> myMarks=new HashMap<>();

        myMarks.put("Ankita",75);
        myMarks.put("Shweta",91);
        myMarks.put("Kirti",83);
        myMarks.put("Meera",59);

        System.out.println(myMarks);
        System.out.println(myMarks.get("Ankita"));
        System.out.println(myMarks.containsKey("Shagun"));
        System.out.println(myMarks.containsValue(91));

        myMarks.put("Shweta",95);
        System.out.println(myMarks);

        myMarks.replace("Kirti",89);
        System.out.println(myMarks);

        myMarks.putIfAbsent("Neha",74);
        System.out.println(myMarks);

        myMarks.remove("Meera");
        System.out.println(myMarks);

    }
}
