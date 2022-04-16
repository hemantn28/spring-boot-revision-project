package friday_8_4_2022;

import java.util.HashSet;

public class HashSet_CWH {
    public static void main(String[] args) {
        //Syntax: Collection_Name<Datatype> Object_Name=new Collection_Name<>();

        HashSet<Integer> integerHashSet=new HashSet<>();

        integerHashSet.add(8);
        integerHashSet.add(5);
        integerHashSet.add(9);
        integerHashSet.add(8);
        integerHashSet.add(5);
        integerHashSet.add(1);

        System.out.println(integerHashSet);

        System.out.println("Printing Thru Advance for loop");
        for (Integer var:integerHashSet){
            System.out.print(var);
            System.out.print(",");
        }
        System.out.println("\n");


    }
}
