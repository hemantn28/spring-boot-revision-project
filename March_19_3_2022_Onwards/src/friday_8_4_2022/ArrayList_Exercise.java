package friday_8_4_2022;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Exercise {
    public static void main(String[] args) {
        //Syntax:Collection_Name<Datatype> Object_Name=new Collection_name<>();
        //Q.1. Write a Java program to create a new array list, add some elements (string) and print out the collection and
        // iterate through all elements in the array list.Insert an element into the array list at the first position.
        // Retrieve an element (at a specified index) from a given array list.
        // Update specific array element by given element.
        // Remove the third element from a array list.
        // Search an element in array list.
        // Sort the given array list.
        // Copy one array list into another.
        // Shuffle elements in the given array list.
        // Reverse elements in the given array list.
        // Extract a portion of the given array list.

        ArrayList<String> stringArrayList=new ArrayList<>();
        ArrayList<String> stringArrayList1=new ArrayList<>();

        stringArrayList1.add("Paper");
        stringArrayList1.add("Pencil");
        stringArrayList1.add("Rubber");
        stringArrayList1.add("Scale");

        stringArrayList.add("Red");
        stringArrayList.add("Green");
        stringArrayList.add("Orange");
        stringArrayList.add("White");
        stringArrayList.add("Black");
        stringArrayList.add(1,"Purple");
        System.out.println(stringArrayList.get(1));
        stringArrayList.set(2,"Voilet");
       // stringArrayList.remove(3);
       // System.out.println(stringArrayList.contains("White"));

       // System.out.println("Arraylist before sort "+stringArrayList);
     //Collections.sort(stringArrayList);
       // System.out.println("Arraylist after sort "+stringArrayList);
       /* Collections.copy(stringArrayList , stringArrayList1);
        System.out.println("Copy stringArrayList to stringArrayList1,\nAfter Copy:");
        System.out.println("stringArrayList: "+stringArrayList1);
        System.out.println("stringArrayList1: "+stringArrayList1);*/

       /* System.out.println("Arraylist before shuffling:\n"+stringArrayList);
        Collections.shuffle(stringArrayList);
        System.out.println("Arraylist after shuffling:\n"+stringArrayList);*/

        System.out.println("Arraylist before reversing:\n"+stringArrayList);
        Collections.reverse(stringArrayList);
        System.out.println("Arraylist after reversing:\n"+stringArrayList);


        /*System.out.println("\n");

        System.out.println("Iteration Thru For Loop");
        for (int i=0;i< stringArrayList.size();i++){
            System.out.print(stringArrayList.get(i));
            System.out.print(",");
        }
        System.out.println("\n");
        System.out.println("Iteration Thru Advance For Loop");
        for (String var:stringArrayList){
            System.out.print(var);
            System.out.print(",");
        }*/


    }

}
