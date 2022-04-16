package saturday_9_4_2022;

import friday_8_4_2022.Bike;

import java.util.HashSet;

public class HashSetNonPrimitive {
    public void createHashSet(){
        //Syntax:Collection_Name<Datatype> Object_Name=new Collection_Name<>();
        HashSet<Bike> bikeHashSet=new HashSet<>();

        Bike bike1=new Bike("Royal enfield","Classic",250000);
        Bike bike2=new Bike("Yamaha","Libero",48000);
        Bike bike3=new Bike("Suzuki","Hayate",50000);
        Bike bike4=new Bike("Bajaj","Discover",70000);

        bikeHashSet.add(bike1);
        bikeHashSet.add(bike2);
        bikeHashSet.add(bike3);
        bikeHashSet.add(bike4);

        System.out.println(bike1.hashCode());
        System.out.println(bike2.hashCode());

        for (Bike var:bikeHashSet){
            System.out.println(var.getName()+" "+var.getModel()+" "+var.getPrice());
            System.out.print(" ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        HashSetNonPrimitive hashset=new HashSetNonPrimitive();
        hashset.createHashSet();
    }
}
