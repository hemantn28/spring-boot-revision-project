package Thursday_7_4_2022;

import java.util.HashSet;

public class DoubleHashSet {

    public void createHashSet(){
        //Syntax: Collection_Name<Datatype>Object_Name=new Collection_Name<>();

        HashSet<Double> doubleHashSet=new HashSet<>();

        doubleHashSet.add(45.2);
        doubleHashSet.add(91.7);
        doubleHashSet.add(73.16);
        doubleHashSet.add(46.8);
        doubleHashSet.add(45.2);
        doubleHashSet.add(91.7);
        doubleHashSet.add(45.2);
        System.out.println("Size of set is "+doubleHashSet.size());
        System.out.println(doubleHashSet.contains(46.9));

        System.out.println(doubleHashSet.remove(73.16));


        System.out.println("The set is as follows" +doubleHashSet);
        System.out.println("\n");

        System.out.println("Printing Thru Advance For Loop");
        for (double var:doubleHashSet){
            System.out.print(var);
            System.out.print(",");
        }
        System.out.println("\n");

        System.out.println("Printing Thru For Loop");
        for (int i=0; i< doubleHashSet.size();i++){
        }
        System.out.print(doubleHashSet);
        System.out.print(",");
    }

    public static void main(String[] args) {
        DoubleHashSet dhs=new DoubleHashSet();
        dhs.createHashSet();
    }
}
