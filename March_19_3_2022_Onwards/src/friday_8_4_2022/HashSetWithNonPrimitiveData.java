package friday_8_4_2022;

import java.util.HashSet;

public class HashSetWithNonPrimitiveData {
    public void createHashSet(){
        HashSet<Bike> bikeHashSet=new HashSet<>();

        Bike bike1=new Bike("Hero","Splendor",85000);
        Bike bike2=new Bike("Bajaj","Pulsar",185000);
        Bike bike3=new Bike("Honda","Shine",90000);
        Bike bike4=new Bike("TVS","Radeon",75000);

        bikeHashSet.add(bike1);
        bikeHashSet.add(bike2);
        bikeHashSet.add(bike3);
        bikeHashSet.add(bike4);

        System.out.println("Printing Thru Advance For loop");
        for (Bike var:bikeHashSet){
            System.out.println(var.getName()+" "+var.getModel()+" "+var.getPrice());

        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        HashSetWithNonPrimitiveData hashset=new HashSetWithNonPrimitiveData();
        hashset.createHashSet();
    }
}
