package collections;

import java.util.ArrayList;

public class DemoArrayList {
    //syntax: collectionname objname=new collectionname();

    public void createArrayList(){
        ArrayList obj=new ArrayList();

        //add
        obj.add("Ramesh");
        obj.add("Ramesh");
        obj.add("Rahul");
        obj.add("Rahul");
        obj.add("Kamal");
        obj.add("Kamal");
        obj.add("Kamal");
        obj.add("Bhola");

        //get(index);

        System.out.println(obj.get(3));
        System.out.println(obj.get(0));
        System.out.println(obj.get(2));
        System.out.println(obj.get(1));

        for(int i=0; i< obj.size(); i++){

            System.out.println("printing using for loop "+obj.get(i));
        }
        //advance for loop: for(datatype var:array/collection){code};
        for(Object var:obj){
            System.out.println("ADVANCE LOOP: "+var);
        }
        //remove(index);
        obj.remove(0);
        System.out.println("printing 0 "+obj.get(0));

    }
    public void createIntegerList(){
        ArrayList<Integer> integerArrayList=new ArrayList<>();
        integerArrayList.add(35);
        integerArrayList.add(39);
        integerArrayList.add(61);
        integerArrayList.add(87);
        integerArrayList.add(41);
        for (Integer var: integerArrayList){
            System.out.println("printing value "+var);
        }
    }

    public void createStringList(){
        //syntax for generics: collectionname <datatype> objname=new collectionaname();
        ArrayList<String> stringArrayList=new ArrayList<>();
        stringArrayList.add("Rohan");
        stringArrayList.add("Nimisha");
        stringArrayList.add("Ruchi");
        stringArrayList.add("Abhishek");
        for(String var: stringArrayList){
            System.out.println("printing value "+var);
        }

    }

    public static void main(String[] args) {
        DemoArrayList obj=new DemoArrayList();
        obj.createArrayList();
        obj.createStringList();
        obj.createIntegerList();
    }

}
