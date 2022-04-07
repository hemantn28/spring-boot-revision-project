package saturday_2_4_2022;

import java.util.*;

public class Collections_Arraylist {
    public static void main(String[] args) {
        //syntax: Collection_name <datatype> objname=new Collection_name();
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>(5);

        a2.add(15);
        a2.add(18);
        a2.add(19);

        a1.add(6);
        a1.add(7);
        a1.add(4);
        a1.add(6);
        a1.add(5);
        a1.add(0,8);
        a1.add(0,1);
        a1.addAll(0,a2);
        Collections.sort(a1);
        System.out.println(a1);

       /* System.out.println(a1.contains(9));
        System.out.println(a1.indexOf(7));
        System.out.println(a1.indexOf(6));
        System.out.println(a1.lastIndexOf(6));

        for (int i=0; i<a1.size();i++){
            System.out.print(a1.get(i));
            System.out.print(",");
        }*/

    }
}
