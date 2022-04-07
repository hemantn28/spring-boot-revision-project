package wednesday_6_4_2022;

import monday_4_4_2022.Student;

import java.util.ArrayList;

public class ListWithPrimitive {
    public static void main(String[] args) {
        //syntax: CollectionName<datatype>objname=new CollectionName<>();
        ArrayList<Student> studentArrayList=new ArrayList<>();

        Student st1=new Student("Raj",40,"IT");
        Student st2=new Student("Yash",57,"CE");
        Student st3=new Student("Mohan",24,"ME");
        Student st4=new Student("Harendar",17,"CS");

        //add object
        studentArrayList.add(st1);
        studentArrayList.add(st2);
        studentArrayList.add(st3);
        studentArrayList.add(st4);

        //get element
        System.out.println(studentArrayList.get(0).getName()+" "+studentArrayList.get(0).getRollNo()+" "+studentArrayList.get(0).getSection());
        System.out.println(studentArrayList.get(1).getName()+" "+studentArrayList.get(1).getRollNo()+" "+studentArrayList.get(1).getSection());
        System.out.println(studentArrayList.get(2).getName()+" "+studentArrayList.get(2).getRollNo()+" "+studentArrayList.get(2).getSection());
        System.out.println(studentArrayList.get(3).getName()+" "+studentArrayList.get(3).getRollNo()+" "+studentArrayList.get(3).getSection());

        //setter method
        st1.setName("Akash");
        System.out.println(st1.getName());

        for (int i=0;i<studentArrayList.size();i++){
            System.out.print(studentArrayList.get(i).getName()+" "+studentArrayList.get(i).getRollNo()+" "+studentArrayList.get(i).getSection());
            System.out.print(",");
        }
        System.out.println("\n");

        for (Student var:studentArrayList){
            System.out.println(var.getName()+" "+var.getRollNo()+" "+var.getSection());
        }



    }
}
