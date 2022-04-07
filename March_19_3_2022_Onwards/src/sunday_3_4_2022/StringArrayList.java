package sunday_3_4_2022;

import java.util.*;
import java.util.Collections;

public class StringArrayList {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        //add elements
        list.add("Ram");
        list.add("Sohan");
        list.add("Amit");
        list.add("Manish");
        list.add("Mukesh");
        list.add("Krishna");

        System.out.println(list);

        //get elements

        System.out.println(list.get(5));

        //add element in between

        list.add(0,"Lokesh");
        System.out.println(list);

        //set element
        list.set(4,"Susheel");
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //size
        System.out.println(list.size());

        //loops
        for (int i=0; i< list.size();i++){
            System.out.print(list.get(i));
            System.out.print(",");
        }
        //sorting
        Collections.sort(list);
        System.out.println(list);


    }
}
