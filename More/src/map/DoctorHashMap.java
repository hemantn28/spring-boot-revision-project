package map;

import model.Doctor;
import model.Player;

import java.util.HashMap;

public class DoctorHashMap {
    public void createHashmap(){
        //syntax: CollectionName<Datatype_key, datatype_value> obj_name=new CollectionName(){CODE}

        HashMap<Integer, Doctor> doctorHashMap=new HashMap<>();

        //create object of doctor model class.
        Doctor doctor1=new Doctor("Mahesh Gupta",500,"Hari Parwat");
        Doctor doctor2=new Doctor("Sanjeev Jain",100,"Bazaar");
        Doctor doctor3=new Doctor("Sanjay Jain",150,"Canara Bank");

        //add
        doctorHashMap.put(500,doctor1);
        doctorHashMap.put(100,doctor2);
        doctorHashMap.put(150,doctor3);

        for (Integer var: doctorHashMap.keySet()){
            System.out.println(doctorHashMap.get(var).getName());
            System.out.println(doctorHashMap.get(var).getFee());
            System.out.println(doctorHashMap.get(var).getLocation());
        }

    }

    public static void main(String[] args) {
        DoctorHashMap obj=new DoctorHashMap();
        obj.createHashmap();
    }
}
