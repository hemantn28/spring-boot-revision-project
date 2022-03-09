package collection_demo;

import java.util.ArrayList;

public class Array_Demo {
    //syntax: collectionname objname=new collectionname();
    public void createArrayList(){
        ArrayList obj=new ArrayList();

        //add
        obj.add("spring");//index 1
        obj.add("springboot");//index 2
        obj.add(33);//index 3
        obj.add(34.6);//index 4
        obj.add("cloud");//index 5

        //get(index);

        System.out.println("Printing 3 index element: "+obj.get(3));
        System.out.println("Printing 0 index element: "+obj.get(0));
        System.out.println("Printing 2 index element: "+obj.get(2));
        System.out.println("Printing 1 index element: "+obj.get(1));

        for(int i=0; i<obj.size(); i++){
            System.out.println("FOR LOOP: Printing element "+obj.get(i));
        }
        //Advance for loop: for (Datatype var: array/collection){CODE}
        for(Object var: obj){
            System.out.println("ADVANCE LOOP: "+var);
        }
        //remove(index 0);
        System.out.println("Printing "+obj.get(0));
    }

    public static void main(String[] args) {
        Array_Demo obj=new Array_Demo();
        obj.createArrayList();
    }
}
