package friday_8_4_2022;

import java.util.ArrayList;

public class ArraylistWithNonPrimitiveData {
    public void createList(){
        //Syntax: Collection_Name<Datatype> Object_Name=new Collection_Name<>();
        ArrayList<CM> cmArrayList=new ArrayList<>();

        CM cm1=new CM("Yogi Adityanath", "U.P",45);
        CM cm2=new CM("Arvind Kejriwal", "Delhi",50);
        CM cm3=new CM("Mamta Banerjee", "West Bengal",55);
        CM cm4=new CM("Nitish Kumar", "Bihar",65);

        cmArrayList.add(cm1);
        cmArrayList.add(cm2);
        cmArrayList.add(cm3);
        cmArrayList.add(cm4);

       //getting an element
        System.out.println(cm1.getName()+","+cm1.getState()+","+cm1.getAge());
        System.out.println(cm2.getName()+","+cm2.getState()+","+cm2.getAge());
        System.out.println(cm3.getName()+","+cm3.getState()+","+cm3.getAge());
        System.out.println(cm4.getName()+","+cm4.getState()+","+cm4.getAge());
        System.out.println("\n");

        ArrayList<Bike> bikeArrayList=new ArrayList<>();
         Bike bike1=new Bike("Hero","Splendor",85000);
         Bike bike2=new Bike("Bajaj","Pulsar",185000);
         Bike bike3=new Bike("TVS","Radeon",75000);
         Bike bike4=new Bike("Honda","Shine",90000);

         bikeArrayList.add(bike1);
         bikeArrayList.add(bike2);
         bikeArrayList.add(bike3);
         bikeArrayList.add(bike4);

         //get
        System.out.println(bikeArrayList.get(2));
        System.out.println(bike1.getName()+","+bike1.getModel()+","+bike1.getPrice());
        System.out.println(bike2.getName()+","+bike2.getModel()+","+bike2.getPrice());
        System.out.println(bike3.getName()+","+bike3.getModel()+","+bike3.getPrice());
        System.out.println(bike4.getName()+","+bike4.getModel()+","+bike4.getPrice());

        //setter method
        bike1.setName("Bullet");
        System.out.println(bike1.getName());

        for (Bike var:bikeArrayList){
            System.out.print(var);
            System.out.print(",");
        }
    }


    public static void main(String[] args) {
        ArraylistWithNonPrimitiveData arraylist=new ArraylistWithNonPrimitiveData();
        arraylist.createList();
    }
}
