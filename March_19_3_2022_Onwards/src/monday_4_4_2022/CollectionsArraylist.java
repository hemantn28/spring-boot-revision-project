package monday_4_4_2022;
import  java.util.*;

public class CollectionsArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();

        al.add(5);
        al.add(6);
        al.add(9);
        al.add(1);
        al.add(6);
        al.add(3);


        System.out.println(al);

        //get element
        System.out.println(al.get(2));

        //add element in between
        al.add(1,4);

        System.out.println(al);

        //set element
        al.set(2,10);
        System.out.println(al);

        //delete element
        al.remove(5);
        System.out.println(al);

        //size
        System.out.println(al.size());

        //sorting
        Collections.sort(al);
        System.out.println(al);

        //loops
        for (int i=0; i<al.size(); i++){
            System.out.print(al.get(i));
            System.out.print(",");
        }



    }
}
