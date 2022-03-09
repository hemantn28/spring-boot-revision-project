package collection;

import java.util.ArrayList;

public class ArrayDemo {
    //syntax: CollectionName objname=new CollectionName();

    public void createArraylist() {
        ArrayList obj = new ArrayList();

        //add
        obj.add("Java");//index 0
        obj.add("Spring");// index 1
        obj.add("Springboot");// index 2
        obj.add(33);
        obj.add(34.6);
        obj.add("Cloud");// index 3

        //get(index);
        System.out.println("Printing 2 index element " + obj.get(2));
        System.out.println("Printing 0 index element " + obj.get(0));
        System.out.println("Printing 3 index element " + obj.get(3));
        System.out.println("Printing 1 index element " + obj.get(1));

        for (int i = 0; i < obj.size(); i++) {
            System.out.println("FOR LOOP: Printing element " + obj.get(i));
        }
        //advance for loop: for(Datatype var: array/collection){CODE}
        for (Object var : obj) {
            System.out.println("ADVANCE LOOP: " + var);
        }
        //remove(index);
        obj.remove(0);

        System.out.println("Printing 0 " + obj.get(0));
    }
    public void createStringList(){

        //syntax: CollectionName<DataType> objname= New CollectionName();
        ArrayList<String>stringArrayList=new ArrayList<>();
        stringArrayList.add("Java");
        stringArrayList.add("Spring");
        stringArrayList.add("Microservices");
        for(String var: stringArrayList){
            System.out.println("Printing value "+var);
        }

    }
    public void createintegerlist(){
        //syntax: CollectionName<DataType> objname= New CollectionName();
        ArrayList<Integer>integerArrayList=new ArrayList<>();
        integerArrayList.add(33);
        integerArrayList.add(44);
        integerArrayList.add(55);
        for(Integer var: integerArrayList){
            System.out.println("Printing integerArrayList value "+var);
        }



    }
    public static void main(String[] args) {
        ArrayDemo obj=new ArrayDemo();
        obj.createArraylist();
        obj.createStringList();
        obj.createintegerlist();
    }




}
