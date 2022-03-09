package collections;

import java.util.HashSet;

public class DemoHashSet {
    public void create(){
        //syntax: collectionname<datatype> objname=new collectionname();
        HashSet<String> stringHashSet=new HashSet<>();
        stringHashSet.add("Raka");
        stringHashSet.add("Raka");
        stringHashSet.add("Roli");
        stringHashSet.add("Roli");
        stringHashSet.add("Rashmi");

        for(String var: stringHashSet){
            System.out.println("printing HashSet: "+var);
        }

    }
    public void createIntegerList(){
        HashSet<Integer> integerHashSet=new HashSet<>();
        integerHashSet.add(98);
        integerHashSet.add(98);
        integerHashSet.add(68);
        integerHashSet.add(68);
        integerHashSet.add(45);
        integerHashSet.add(45);

        for(Integer var: integerHashSet){
            System.out.println("printing integerHashset: "+var);
        }
    }
    public static void main(String[] args) {
        DemoHashSet obj=new DemoHashSet();
        obj.create();
        obj.createIntegerList();
    }
}
