package tuesday_5_4_2022;

import java.util.ArrayList;

public class DemoArrayList {
    public void createList(){
        //syntax: Collection_Name<datatype> obj_name=new Collection_Name<>();
        ArrayList<String> list=new ArrayList<>();
        //adding elements to list

        list.add("Surekha");
        list.add("Vikas");
        list.add("Vibhor");
        list.add("Piyush");
        list.add("Neha");
        list.add("Alok");
        list.add("Vikas");
        list.add("Suresh");

        //getting an element
       /* System.out.println(list.get(6));

        System.out.println("Printing thru advance for loop: ");
        for(String var:list){
            System.out.print(var);
            System.out.print(",");
        }*/


        //delete element
       list.remove(3);

        System.out.println(list);
    }


    public static void main(String[] args) {
        DemoArrayList dm=new DemoArrayList();
        dm.createList();
    }
}
