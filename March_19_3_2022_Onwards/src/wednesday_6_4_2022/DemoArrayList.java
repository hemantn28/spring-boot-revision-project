package wednesday_6_4_2022;

import java.util.ArrayList;

public class DemoArrayList {
    //syntax:Collection_Name<Datatype> Object_Name=new Collection_Name<>();
    public void createList(){
        ArrayList<String> stringArrayList=new ArrayList<>();
        //adding elements to list
        stringArrayList.add("Ram");
        stringArrayList.add("Sonu");
        stringArrayList.add("Vivek");
        stringArrayList.add("Mohan");
        stringArrayList.add("Ram");
        stringArrayList.add("Krishna");
        System.out.println(stringArrayList.remove(3));

        //getting an element
        System.out.println(stringArrayList.get(0));

        for(String var: stringArrayList){
            System.out.print(var);
            System.out.print(",");
        }
        System.out.println("\n");

        for (int i=0; i<stringArrayList.size(); i++){
            System.out.print(stringArrayList.get(i));
            System.out.print(",");
        }
        System.out.println("\n");


    }

    public static void main(String[] args) {
        DemoArrayList dm=new DemoArrayList();
        dm.createList();
    }
}
