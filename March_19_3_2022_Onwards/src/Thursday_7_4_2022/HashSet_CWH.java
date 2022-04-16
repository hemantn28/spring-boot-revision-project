package Thursday_7_4_2022;

import java.util.HashSet;

public class HashSet_CWH {
    public static void main(String[] args) {
        HashSet<Integer> integerHashSet=new HashSet<>();

        integerHashSet.add(5);
        integerHashSet.add(7);
        integerHashSet.add(1);
        integerHashSet.add(9);
        integerHashSet.add(5);
        integerHashSet.add(7);
        integerHashSet.add(6);

        System.out.println(integerHashSet);

        System.out.println("Printing Thru Advance For Loop ");
        for (int var:integerHashSet){
            System.out.print(var);
            System.out.print(",");
        }
        System.out.println("\n");
    }
}
