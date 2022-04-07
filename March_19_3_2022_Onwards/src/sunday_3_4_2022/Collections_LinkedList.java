package sunday_3_4_2022;


import java.util.LinkedList;

public class Collections_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer>a1=new LinkedList<>();



        a1.add(6);
        a1.add(7);
        a1.add(4);
        a1.add(6);
        a1.add(5);
        a1.add(0,8);
        a1.add(0,1);
        a1.addLast(12);
        a1.addFirst(450 );


        System.out.println(a1.contains(70));
        System.out.println(a1.indexOf(12));

        System.out.println(a1.lastIndexOf(6));

        for (int i=0; i<a1.size();i++){
            System.out.print(a1.get(i));
            System.out.print(",");
        }
    }
}
