package Thursday_7_4_2022;

import java.util.HashSet;
import java.util.Set;

public class SetDemoTelusko {
    public static void main(String[] args) {
        Set<Integer> integerSet=new HashSet<>();

        integerSet.add(5);
        integerSet.add(7);
        integerSet.add(1);
        integerSet.add(9);
        integerSet.add(5);
        integerSet.add(7);
        integerSet.add(8);
        System.out.println(integerSet.add(5));

        for (int var:integerSet){
            System.out.print(var);
            System.out.print(",");
        }
    }
}
