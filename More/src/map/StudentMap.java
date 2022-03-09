package map;

import java.util.HashMap;

public class StudentMap {
    public static void main(String[] args) {
        HashMap<String,Integer> students=new HashMap<>();

        students.put("Amar",1);
        students.put("Bablu",5);
        students.put("Chintu",11);
        students.put("Dharmesh",17);

        System.out.println(students);
        System.out.println(students.get("Amar"));
        System.out.println(students.containsKey("Faheem"));
        System.out.println(students.containsValue(8));

        students.put("Bablu",2);
        System.out.println(students);

        students.replace("Chintu",12);
        System.out.println(students);

        students.putIfAbsent("Mohsin",27);
        System.out.println(students);

        students.remove("Bablu");
        System.out.println(students);


    }
}
