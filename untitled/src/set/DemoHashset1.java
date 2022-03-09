package set;

import collections.DemoHashSet;

import java.util.HashSet;

public class DemoHashset1 package collections;

        import java.util.HashSet;

public class DemoHashSet1 {
    public void createHashSet(){
        //syntax: collectionname <> objname=new collectionname();
        HashSet<String> obj1=new HashSet<>();

        obj1.add("Neha");
        obj1.add("Neha");
        obj1.add("Koyal");
        obj1.add("Koyal");
        obj1.add("Radha");
        obj1.add("Radha");
        obj1.add("Sita");
        obj1.add("Sita");

        for(String var: obj1){
            System.out.println(var);
        }
    }
    public static void main(String[] args) {
        DemoHashSet obj=new DemoHashSet();
        obj.createHashSet();
    }
}
{
}
