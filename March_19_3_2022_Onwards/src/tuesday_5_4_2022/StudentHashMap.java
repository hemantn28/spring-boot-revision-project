package tuesday_5_4_2022;

import monday_4_4_2022.Student;

import java.util.HashMap;

public class StudentHashMap {
    public void createHashMap(){
        //syntax: HashMap<datatype_key datatype_value> obj_name=new HashMap<>();
        HashMap<Integer, Student> studentHashMap=new HashMap<>();

        Student st1=new Student("Raj",45,"IT");
        Student st2=new Student("Mukesh",25,"CS");
        Student st3=new Student("Faheem",15,"ME");
        Student st4=new Student("John",21,"CE");

        studentHashMap.put(1,st1);
        studentHashMap.put(2,st2);
        studentHashMap.put(3,st3);
        studentHashMap.put(4,st4);

        System.out.println(studentHashMap.get(1).getName());
        System.out.println(studentHashMap.get(1).getRollNo());
        System.out.println(studentHashMap.get(1).getSection());

        for (Integer var:studentHashMap.keySet()){
            System.out.println(studentHashMap.get(var).getName()+" "+studentHashMap.get(var).getRollNo()+" "+studentHashMap.get(var).getSection());
        }
    }

    public static void main(String[] args) {
        StudentHashMap obj=new StudentHashMap();
        obj.createHashMap();
    }
}
