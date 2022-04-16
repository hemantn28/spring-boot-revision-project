package friday_8_4_2022;

import java.util.HashSet;

public class HashSetDemo {
    //Syntax: Collection_Name<Datatype> Object_name=new collection_Name<>();
    public void createHashSet(){
        HashSet<String> stringHashSet=new HashSet<>();

        stringHashSet.add("Maths");
        stringHashSet.add("English");
        stringHashSet.add("Hindi");
        stringHashSet.add("Science");
        stringHashSet.add("Bio");
        stringHashSet.add("Physics");
        stringHashSet.add("Hindi");
        stringHashSet.add("Science");

        System.out.println("Printing Thru Advance For Loop");
        for (String var:stringHashSet){
            System.out.print(var);
            System.out.print(",");
        }
        System.out.println("\n");
        System.out.println("Printing Thru For Loop");
        for (int i=0;i< stringHashSet.size();i++){

        }
        System.out.print(stringHashSet);
        System.out.print(",");
        System.out.println("\n");




    }
    public void createIntegerHashSet(){
        HashSet<Integer> integerHashSet=new HashSet<>();

        integerHashSet.add(8);
        integerHashSet.add(1);
        integerHashSet.add(7);
        integerHashSet.add(9);
        integerHashSet.add(6);
        integerHashSet.add(1);
        integerHashSet.add(8);

        System.out.println("Printing Thru Advance For Loop");
        for (int var:integerHashSet){
            System.out.print(var);
            System.out.print(",");
        }
        System.out.println("\n");

        System.out.println("Printing Thru For Loop");
        for (int i=0;i< integerHashSet.size();i++){

        }
        System.out.print(integerHashSet);
        System.out.print(",");

        System.out.println("\n");
    }


    public static void main(String[] args) {
        HashSetDemo hashSetDemo=new HashSetDemo();
        hashSetDemo.createHashSet();
        hashSetDemo.createIntegerHashSet();
    }
}
