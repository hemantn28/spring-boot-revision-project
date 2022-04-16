package Thursday_7_4_2022;

import java.util.HashSet;

public class HashSetDemo {
    public void createHashSet(){
        //Syntax: Collection_Name<Datatype> Object_Name=new Collection_Name<>();

       HashSet<String> stringHashSet=new HashSet<>();

        stringHashSet.add("Nitesh");
        stringHashSet.add("Harish");
        stringHashSet.add("Sonu");
        stringHashSet.add("Bablu");
        stringHashSet.add("Harish");
        stringHashSet.add("Nitesh");

        System.out.println("Printing Thru Advance For loop");
        for (String var:stringHashSet){
            System.out.print(var);
            System.out.print(",");
        }
        System.out.println("\n");

        System.out.println("Printing Thru  For loop");
        for (int i=0;i<stringHashSet.size();i++){
        }
        System.out.print(stringHashSet);
        System.out.print(",");

        // System.out.println(stringHashSet.contains("Imran"));
        // System.out.println(stringHashSet.size());
        // System.out.println(stringHashSet.remove("Harish"));
       // System.out.println(stringHashSet);
    }
    public static void main(String[] args) {
        HashSetDemo hashSetDemo=new HashSetDemo();
        hashSetDemo.createHashSet();

    }
}
