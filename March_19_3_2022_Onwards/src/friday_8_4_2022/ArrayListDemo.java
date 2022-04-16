package friday_8_4_2022;

import java.util.ArrayList;

public class ArrayListDemo {
    public void createList(){
        //Syntax: Collection_Name<Datatype> ObjectName=new Collection_Name<>();

        ArrayList<String> stringArrayList=new ArrayList<>();
        ArrayList<String> stringArrayList1=new ArrayList<>();

        //adding elements to list.

        stringArrayList1.add("Neha");
        stringArrayList1.add("Sushma");
        stringArrayList1.add("Pooja");
        stringArrayList1.add("Komal");
        stringArrayList1.add("Suman");

        stringArrayList.add("Ram");
        stringArrayList.add("Navdeep");
        stringArrayList.add("Parag");
        stringArrayList.add("Shadman");
        stringArrayList.add("Prafull");
        stringArrayList.add("Mohit");
        stringArrayList.add("Abhishek");
        stringArrayList.add("Ram");
        stringArrayList.add("Prakash");
        stringArrayList.add("Mahesh");
        stringArrayList.add("Roopal");
        stringArrayList.add(7,"Rohan");
        stringArrayList.addAll(0,stringArrayList1);
      //  System.out.println(stringArrayList.contains("Neha"));
      //  System.out.println(stringArrayList.indexOf("Ram"));
      //  System.out.println(stringArrayList.lastIndexOf("Ram"));
       // stringArrayList.set(7,"Avtar");
        System.out.println(stringArrayList.toArray());
        System.out.println(stringArrayList);
        stringArrayList.trimToSize();



       /* System.out.println(stringArrayList.get(9));

        System.out.println(stringArrayList);

        System.out.println("Printing Thru For Loop");
        for (int i=0;i<stringArrayList.size();i++){
            System.out.print(stringArrayList.get(i));
            System.out.print(",");
        }
        System.out.println("\n");

        System.out.println("Printing Thru Advance For Loop");
        for (String var: stringArrayList){
            System.out.print(var);
            System.out.print(",");
        }
        System.out.println("\n");*/
    }

    public static void main(String[] args) {
        ArrayListDemo arraylist=new ArrayListDemo();
        arraylist.createList();
    }
}
