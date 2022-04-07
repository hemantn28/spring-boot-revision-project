package sunday_3_4_2022;

import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) {
        //syntax: collection_name<datatype>obj_name=new collection_name<>();

        ArrayList<Integer> array=new ArrayList<>();
        ArrayList<Integer> array2=new ArrayList<>(5);

        array2.add(19);
        array2.add(12);
        array2.add(15);
        array2.add(18);
        array2.add(16);

        array.add(5);
        array.add(4);
        array.add(7);
        array.add(9);
        array.add(5);
        array.add(1);
        array.add(3);
        array.add(8);
        array.add(2);
        array.add(6);
        array.add(0,7);
        array.addAll(0,array2);
        array.remove(3);
        array.set(12,500);
        System.out.println(array);

       /* System.out.println(array.contains(19));
        System.out.println(array.indexOf(1));
        System.out.println(array.indexOf(5));
        System.out.println(array.lastIndexOf(5));

        for (int i=0; i<array.size();i++){
            System.out.print(array.get(i));
            System.out.print(",");
        }*/


    }
}
