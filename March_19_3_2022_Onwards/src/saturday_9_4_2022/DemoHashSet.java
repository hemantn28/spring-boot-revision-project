package saturday_9_4_2022;

import java.util.HashSet;

public class DemoHashSet {
    public void createHashSet(){
        //Syntax: Collection_Name<Datatype> Obj_Name=new Collection_name<>();
        HashSet<String> stringHashSet=new HashSet<>();

        stringHashSet.add("New Delhi");
        stringHashSet.add("Mumbai");
        stringHashSet.add("Raipur");
        stringHashSet.add("Jaipur");
        stringHashSet.add("New Delhi");
        stringHashSet.add("Chennai");
        stringHashSet.add("Raipur");
        stringHashSet.add("");
        stringHashSet.add("Patna");
        stringHashSet.add("Shimla");
        stringHashSet.add("Panaji");
        stringHashSet.add("Patna");

        //loop
        for (String var:stringHashSet){
            System.out.print(var);
            System.out.print(",");
        }
        System.out.println("\n");

    }
    public void createIntegerHashSet(){
        HashSet<Integer> integerHashSet=new HashSet<>();
        integerHashSet.add(5);
        integerHashSet.add(7);
        integerHashSet.add(6);
        integerHashSet.add(9);
        integerHashSet.add(8);
        integerHashSet.add(3);
        integerHashSet.add(1);
        integerHashSet.add(2);
        integerHashSet.add(7);
        integerHashSet.add(9);
        integerHashSet.add(4);
        integerHashSet.add(6);

        for (Integer var:integerHashSet){
            System.out.print(var);
            System.out.print(",");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        DemoHashSet hashSet=new DemoHashSet();
        hashSet.createHashSet();
        hashSet.createIntegerHashSet();
    }
}
