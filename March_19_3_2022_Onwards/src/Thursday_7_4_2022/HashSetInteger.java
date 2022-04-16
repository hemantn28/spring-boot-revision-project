package Thursday_7_4_2022;

import java.util.HashSet;

public class HashSetInteger {
    public void createIntegerHashSet() {
        HashSet<Integer> integerHashSet = new HashSet<>();

        integerHashSet.add(87);
        integerHashSet.add(786);
        integerHashSet.add(47);
        integerHashSet.add(91);
        integerHashSet.add(23);
        integerHashSet.add(47);
        integerHashSet.add(50);
        integerHashSet.add(61);
        integerHashSet.add(87);


        System.out.println("\n");

        System.out.println("Printing Thru Advance For Loop");
        for (int var: integerHashSet){
            System.out.print(var);
            System.out.print(",");
        }
        System.out.println("\n");

        System.out.println("Printing Thru For Loop");
        for (int i=0;i<integerHashSet.size();i++){

        }
        System.out.print(integerHashSet);
        System.out.print(",");
        System.out.println("\n");

        System.out.println(integerHashSet.contains(23));
        System.out.println(integerHashSet.size());
        System.out.println(integerHashSet.remove(91));
        System.out.println(integerHashSet);
    }


    public static void main(String[] args) {
        HashSetInteger hashSetInteger = new HashSetInteger();
        hashSetInteger.createIntegerHashSet();

    }

}
