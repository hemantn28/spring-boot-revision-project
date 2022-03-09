package collection;

import java.math.BigInteger;
import java.util.ArrayList;

public class DemoArrayList {

    //syntax: collectionname objname=new collectionname();

    public void createArraylist(){

        ArrayList obj=new ArrayList();

        //add
        obj.add("Java");//index 0
        obj.add("Spring");//index 1
        obj.add("Springboot");//index 2
        obj.add("Cloud");//index 3

        //get(index);
        System.out.println("printing 3 index element "+obj.get(3));
        System.out.println("printing 2 index element "+obj.get(2));
        System.out.println("printing 0 index element "+obj.get(0));
        System.out.println("printing 1 index element "+obj.get(1));

        for(int i=0; i< obj.size();i++){
            System.out.println("FOR LOOP: Printing element "+obj.get(i));
        }
        //syntax of advance for loop: for(datatype var: array/collection){CODE}


    }

    public static void main(String[] args) {
        DemoArrayList obj=new DemoArrayList();
        obj.createArraylist();
    }



}
