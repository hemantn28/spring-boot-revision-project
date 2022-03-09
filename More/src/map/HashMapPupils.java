package map;

import model.Pupils;

import java.util.HashMap;

public class HashMapPupils {
    public void create(){
        //syntax: Collectionname<datatype_key,datatype_value> obj_name=new Collectionname(){CODE}

        HashMap<Integer, Pupils> pupilsHashMap=new HashMap<>();

        //create object of pupils model class.
        Pupils pupils1=new Pupils("Ravi",33,"Maths");
        Pupils pupils2=new Pupils("Vijay",59,"Bio");
        Pupils pupils3=new Pupils("Sohan",47,"Commerce");

        //add
        pupilsHashMap.put(33,pupils1);
        pupilsHashMap.put(59,pupils2);
        pupilsHashMap.put(47,pupils3);

        for (Integer var: pupilsHashMap.keySet()){
            System.out.println(pupilsHashMap.get(var).getName());
            System.out.println(pupilsHashMap.get(var).getRollNo());
            System.out.println(pupilsHashMap.get(var).getSection());


        }
    }

    public static void main(String[] args) {
        HashMapPupils obj=new HashMapPupils();
        obj.create();
    }
}
