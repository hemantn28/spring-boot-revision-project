package Thursday_7_4_2022;

import monday_4_4_2022.Student;

import java.util.HashSet;

public class SetPrimitiveData {

    public void createSet(){
        //Syntax:CollectionName<Datatype>Obj_Name=new CollectionName<>();
        HashSet<Student> studentHashSet=new HashSet<>();

        Student st1=new Student("Kartik",24,"CS");
        Student st2=new Student("Kamal",23,"IT");
        Student st3=new Student("Kartik",24,"CS");
        Student st4=new Student("Ram",42,"ME");
        Student st5=new Student("Suresh",51,"CE");
        Student st6=new Student("Kamal",23,"IT");

        studentHashSet.add(st1);
        studentHashSet.add(st2);
        studentHashSet.add(st3);
        studentHashSet.add(st4);
        studentHashSet.add(st5);
        studentHashSet.add(st6);

        for (Student var:studentHashSet){
            System.out.println(var.getName()+"  "+var.getRollNo()+"  "+var.getSection());
        }

    }

    public static void main(String[] args) {
        SetPrimitiveData spd=new SetPrimitiveData();
        spd.createSet();
    }
}
