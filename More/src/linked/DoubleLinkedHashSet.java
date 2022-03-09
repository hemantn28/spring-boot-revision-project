package linked;

import java.util.LinkedHashSet;

public class DoubleLinkedHashSet {
    public void createLinkedHashset(){
        //syntax: CollectionName<Datatype> objname=new CollectionName(){CODE}

        LinkedHashSet<Double> doubleLinkedHashSet=new LinkedHashSet<>();

        doubleLinkedHashSet.add(11.2);
        doubleLinkedHashSet.add(87.5);
        doubleLinkedHashSet.add(34.1);
        doubleLinkedHashSet.add(51.0);
        doubleLinkedHashSet.add(91.7);

        for (Double var: doubleLinkedHashSet){
            System.out.println("Printing doubleLinkedHashSet "+var);
        }
        System.out.println(doubleLinkedHashSet.contains(34.2));
    }

    public static void main(String[] args) {
        DoubleLinkedHashSet obj=new DoubleLinkedHashSet();
        obj.createLinkedHashset();

    }
}
