package wednesday_6_4_2022;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        //syntax:CollectionName<Datatype>ObjName=new CollectionName<>();
        ArrayList<Integer> list=new ArrayList<Integer>();

        //add elements
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //get elements
        System.out.println(list.get(1));

        //to add elements in between
        list.add(1,1);
        System.out.println(list);

        //set element
        list.set(0,5);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        System.out.println(list.size());

        //loop
        System.out.println("Printing Thru For Loop: ");
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i));
            System.out.print(",");
        }
        System.out.println("\n");

        System.out.println("Printing Thru For Each Loop:");
        for (int var:list){
            System.out.print(var);
            System.out.print(",");
        }
        System.out.println("\n");

        //sorting
        Collections.sort(list);
        System.out.println(list
        );
    }
}
