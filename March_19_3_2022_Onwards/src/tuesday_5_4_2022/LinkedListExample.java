package tuesday_5_4_2022;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> namesLinkedList=new LinkedList<>();
        namesLinkedList.add("Vikas");
        namesLinkedList.add("Rahul");
        namesLinkedList.add("Mani");
        namesLinkedList.add("Shivam");
        namesLinkedList.add("Mohit");
        //System.out.println(namesLinkedList.get(2));
        namesLinkedList.add(2,"Hiten");
        System.out.println(namesLinkedList);

        String[] names=new String[5];
        ArrayList<String> namesArrayList=new ArrayList<>();
        namesArrayList.add("Vikas");
        namesArrayList.add("Rahul");
        namesArrayList.add("Mani");
        namesArrayList.add("Shivam");
        namesArrayList.add("Mohit");
       // System.out.println(namesArrayList.get(2));
        namesArrayList.add(2,"Hiten");
        System.out.println(namesArrayList);





    }
}
