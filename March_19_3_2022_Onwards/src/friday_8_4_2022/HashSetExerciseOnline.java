package friday_8_4_2022;

import java.util.Collections;
import java.util.HashSet;

public class HashSetExerciseOnline {
    public static void main(String[] args) {
        //Syntax: Collection_Name<Datatype> Object_Name=new Collection_Name<>();
        //Q.1.Write a Java program to test a hash set is empty or not.

        HashSet<String> myHashSet=new HashSet<>();

        myHashSet.add("Red");
        myHashSet.add("Green");
        myHashSet.add("White");
        myHashSet.add("Pink");
        myHashSet.add("Yellow");
        myHashSet.add("Red");

       /* System.out.println("Original HashSet "+myHashSet);
        System.out.println(myHashSet.isEmpty());
        myHashSet.removeAll(myHashSet);
        System.out.println("HashSet after removing all elements "+myHashSet);*/

        //Check if the hashSet contains a specific element.
       // System.out.println(myHashSet.contains("Yellow"));

        //removing elements from set
      // myHashSet.remove("White");
      //  System.out.println(myHashSet);

        //Removing all the elements available in the set .
       // myHashSet.clear();
        //System.out.println(myHashSet);
        
        //size of set
        System.out.println(myHashSet.size());

        //loop
        for (String var:myHashSet){
            System.out.print(var);
            System.out.print(",");
        }
        System.out.println("\n");

    }
}
