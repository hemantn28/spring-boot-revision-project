package friday_8_4_2022;

import java.util.ArrayList;

public class ArrayList_CWH {
    public static void main(String[] args) {
        //Syntax: Collection_Name<Datatype> Obj_Name=new CollectionName<>();

        ArrayList<Integer> integerArrayList=new ArrayList<>();
        ArrayList<Integer> integerArrayList1=new ArrayList<>();

        integerArrayList1.add(15);
        integerArrayList1.add(17);
        integerArrayList1.add(19);
        integerArrayList1.add(11);
        integerArrayList1.add(14);

        integerArrayList.add(5);
        integerArrayList.add(7);
        integerArrayList.add(6);
        integerArrayList.add(4);
        integerArrayList.add(3);
        integerArrayList.add(9);
        integerArrayList.add(2);
        integerArrayList.add(1);
        integerArrayList.add(5);
        integerArrayList.add(0,8);
        integerArrayList.add(0,1);
        integerArrayList.addAll(0,integerArrayList1);
        System.out.println(integerArrayList.contains(22));
        System.out.println(integerArrayList.indexOf(1));
        System.out.println(integerArrayList.lastIndexOf(1));
        integerArrayList.set(5,57);
        System.out.println(integerArrayList.size());


        System.out.println(integerArrayList);

       /* System.out.println("Printing Thru For Loop");
        for (int i=0; i<integerArrayList.size();i++){
            System.out.print(integerArrayList.get(i));
            System.out.print(",");
        }
        System.out.println("\n");

        System.out.println("Printing Thru For-Each Loop");
        for (int var:integerArrayList){
            System.out.print(var);
            System.out.print(",");
        }
        System.out.println("\n");*/
    }

}
