package Thursday_7_4_2022;

import java.util.HashSet;

public class DemoHashSet {
    //Syntax: Collection_Name<Datatype> Obj_Name=new Collection_Name<>();

    public void createHashSet(){
        HashSet<String> stringHashSet=new HashSet<>();

        stringHashSet.add("Ram");
        stringHashSet.add("Krishna");
        stringHashSet.add("Mukesh");
        stringHashSet.add("Sohan");
        stringHashSet.add("Ram");
        stringHashSet.add("Krishna");
        stringHashSet.add("Rohit");
        stringHashSet.add("Shailendar");
        stringHashSet.add("Nitin");
        stringHashSet.add("Amar");

       // System.out.println(stringHashSet.clone());
     //   System.out.println(stringHashSet.contains("Ankur"));
     //   System.out.println(stringHashSet.remove("Rohit"));
     //   System.out.println(stringHashSet.size());

     //  System.out.println(stringHashSet);

        /*System.out.println("Printing Thru Advance-For Loop");
        for (String var:stringHashSet){
            System.out.println(var);
        }*/

        //Converting HashSet to Array

        /*String[]Geeks=stringHashSet.toArray(new String[stringHashSet.size()]);
        System.out.println(Geeks[3]);*/

       /* System.out.println("Printing Thru For Loop");
        for (int i=0;i< stringHashSet.size();i++){
        }
        System.out.println(stringHashSet);*/
    }
    public void createIntegerHashSet(){
        HashSet<Integer> integerHashSet=new HashSet<>();

        integerHashSet.add(1);
        integerHashSet.add(8);
        integerHashSet.add(5);
        integerHashSet.add(1);
        integerHashSet.add(6);
        integerHashSet.add(4);
        integerHashSet.add(9);
        integerHashSet.add(8);

        for (int var:integerHashSet){
            System.out.print(var);
            System.out.print(",");
        }
        System.out.println("\n");

        System.out.println(integerHashSet.size());
    }

    public static void main(String[] args) {
        DemoHashSet hashset=new DemoHashSet();
        hashset.createHashSet();
        hashset.createIntegerHashSet();
    }
}
