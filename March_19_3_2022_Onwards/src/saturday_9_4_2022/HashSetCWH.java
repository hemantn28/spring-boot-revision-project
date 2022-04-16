package saturday_9_4_2022;

import java.util.HashSet;

public class HashSetCWH {
    public static void main(String[] args) {
        //Syntax: Collection_Name<Datatype> Object_Name=new Collection_Name<>();

        HashSet<Integer>integerHashSet=new HashSet<>();

        integerHashSet.add(8);
        integerHashSet.add(10);
        integerHashSet.add(9);
        integerHashSet.add(3);
        integerHashSet.add(1);
        integerHashSet.add(7);
        integerHashSet.add(8);
        integerHashSet.add(6);
        integerHashSet.add(2);
        integerHashSet.add(9);

        //System.out.println(integerHashSet);

        //Test whether the given hash set is empty or not.
      /*  System.out.println("Original hashSet "+integerHashSet);
        System.out.println(integerHashSet.isEmpty());*/

        //Check if the hashSet contains a specific element.
      //  System.out.println(integerHashSet.contains(18));

        //removing elements from set.
       /* integerHashSet.remove(8);
        System.out.println(integerHashSet);*/

        //Removing all the elements available in the set .
     /*   integerHashSet.clear();
        System.out.println(integerHashSet);*/

        //Size of set.
      //  System.out.println(integerHashSet.size());

        //loop
        for (Integer var:integerHashSet){
            System.out.print(var);
            System.out.print(",");
        }
    }
}
