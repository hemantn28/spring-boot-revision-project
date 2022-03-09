package linked;

import java.util.LinkedHashSet;

public class DemoLinkedInteger {
    public void createLinkedHashSet(){
        //Syntax: CollectionName<Integer> objname=new Collectionname(){CODE}
        LinkedHashSet<Integer> integerLinkedHashSet=new LinkedHashSet<>();

        integerLinkedHashSet.add(9);
        integerLinkedHashSet.add(7);
        integerLinkedHashSet.add(5);
        integerLinkedHashSet.add(4);
        integerLinkedHashSet.add(3);
        integerLinkedHashSet.add(1);

        for (Integer var: integerLinkedHashSet){
            System.out.println("Printing integerLinkedHashSet "+var);
        }
    }

    public static void main(String[] args) {
        DemoLinkedInteger obj=new DemoLinkedInteger();
        obj.createLinkedHashSet();
    }
}
