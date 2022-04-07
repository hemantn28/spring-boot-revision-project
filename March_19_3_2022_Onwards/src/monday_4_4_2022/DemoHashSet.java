package monday_4_4_2022;

import java.util.HashSet;

public class DemoHashSet {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet=new HashSet<>();

        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11);
        myHashSet.add(8);


        System.out.println(myHashSet.clone());
        System.out.println(myHashSet.contains(6));
        System.out.println(myHashSet.isEmpty());

    }
}
