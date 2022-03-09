package set;

import java.util.HashSet;

public class DemoHashset {
    public void createHashSet(){
        //syntax:collectionname<datatype> objname=new collectionname();

        HashSet<String> myHashSet=new HashSet<>();

        myHashSet.add("Putin");
        myHashSet.add("Zelinsky");
        myHashSet.add("Biden");
        myHashSet.add("Biden");
        myHashSet.add("Putin");
        myHashSet.add("Modi");


        for(String var: myHashSet){
            System.out.println("Printing Hashset: "+var);

        }

    }

    public static void main(String[] args) {
        DemoHashset obj=new DemoHashset();
        obj.createHashSet();
    }
}
