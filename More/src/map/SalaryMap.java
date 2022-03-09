package map;

import java.util.HashMap;

public class SalaryMap {
    public static void main(String[] args) {
        HashMap<String,Integer> salary=new HashMap<>();

        salary.put("Navdeep",165303);
        salary.put("Deepesh",125214);
        salary.put("Karan",185897);
        salary.put("Vinod",115847);

        System.out.println(salary);
        System.out.println(salary.get("Deepesh"));
        System.out.println(salary.containsKey("Vicky"));
        System.out.println(salary.containsValue(145897));

        salary.put("Karan",151698);
        System.out.println(salary);

        salary.replace("Karan",131269);
        System.out.println(salary);

        salary.putIfAbsent("Raja",130658);
        System.out.println(salary);

        salary.remove("Vinod");
        System.out.println(salary);
    }
}
