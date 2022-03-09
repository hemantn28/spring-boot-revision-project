package collection_demo;

import model.Student;

import java.util.ArrayList;

public class ArrayListStudent {

    public void createList(){
        //syntax:collectionname<datatype> objname=new collectionname();

        ArrayList<Student> studentArrayList=new ArrayList<>();

        //create object of student

        Student student1=new Student("Rahul",33,"IT");
        Student student2=new Student("Ramesh",39,"CS");
        Student student3=new Student("Rohit",45,"ME");

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);

        for(Student var: studentArrayList){
            System.out.println("Printing Student arraylist: "+var.getName());
            System.out.println("Printing Student arraylist: "+var.getSection());
            System.out.println("Printing Student arraylist: "+var.getRollNo());
        }

    }

    public static void main(String[] args) {
        ArrayListStudent obj=new ArrayListStudent();
        obj.createList();
    }
}
