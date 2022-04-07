package wednesday_6_4_2022;

import java.util.ArrayList;

public class ArrayListDemo_CWH {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList=new ArrayList<>();
        ArrayList<Integer> integerArrayList2=new ArrayList<>(5);

        integerArrayList2.add(15);
        integerArrayList2.add(18);
        integerArrayList2.add(17);

        integerArrayList.add(6);
        integerArrayList.add(7);
        integerArrayList.add(4);
        integerArrayList.add(6);
        integerArrayList.add(0,5);
        integerArrayList.add(0,1);
        integerArrayList.addAll(0,integerArrayList2);
       // System.out.println(integerArrayList.contains(8));
       // System.out.println(integerArrayList.indexOf(6));
        //System.out.println(integerArrayList.lastIndexOf(6));
        //System.out.println(integerArrayList.remove(1));
        System.out.println(integerArrayList.size());
        integerArrayList.set(1,500);

        //System.out.println(integerArrayList);

        System.out.println("Printing Thru For Loop");
        for (int i=0;i<integerArrayList.size();i++){
            System.out.print(integerArrayList.get(i));
            System.out.print(",");
        }
        System.out.println("\n");



    }
}
