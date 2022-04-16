package saturday_9_4_2022;

import friday_8_4_2022.Bike;

import java.util.HashMap;

public class BikeHashMap {
    public void createHashMap(){
        //Syntax:Collection_Name<Datatype_Key,Datatype_Value> Object_Name=new Collection_Name<>();

        HashMap<Integer, Bike> bikeHashMap=new HashMap<>();

        Bike bike1=new Bike("Hero","Splendor",85000);
        Bike bike2=new Bike("Bajaj","Pulsar",185000);
        Bike bike3=new Bike("TVS","Apache",150000);
        Bike bike4=new Bike("Honda","Shine",95000);

        bikeHashMap.put(1,bike1);
        bikeHashMap.put(2,bike2);
        bikeHashMap.put(3,bike3);
        bikeHashMap.put(4,bike4);

        System.out.println(bikeHashMap.get(1).getName()+" "+bikeHashMap.get(1).getModel()+" "+bikeHashMap.get(1).getPrice());
        System.out.println(bikeHashMap.get(2).getName()+" "+bikeHashMap.get(2).getModel()+" "+bikeHashMap.get(2).getPrice());
        System.out.println(bikeHashMap.get(3).getName()+" "+bikeHashMap.get(3).getModel()+" "+bikeHashMap.get(3).getPrice());
        System.out.println(bikeHashMap.get(4).getName()+" "+bikeHashMap.get(4).getModel()+" "+bikeHashMap.get(4).getPrice());
        System.out.println("\n");
        //loop
        System.out.println("Printing Thru Advance For Loop");
        for (Integer var: bikeHashMap.keySet()){
            System.out.println(bikeHashMap.get(var).getName()+" "+bikeHashMap.get(var).getModel()+" "+bikeHashMap.get(var).getPrice());
        }

    }

    public static void main(String[] args) {
        BikeHashMap bike=new BikeHashMap();
        bike.createHashMap();
    }
}
