package collection;

import model.Student;

import java.util.ArrayList;

public class ArrayListStudent {

    public void createList(){

        //syntax:CollectionName<DataType> objName=new CollectionName();

        ArrayList <Student> studentArrayList=new ArrayList<>();

        //create object of student class

        Student student1=new Student("Ramesh",44,"Arts");
        Student student2=new Student("Keshav",20,"Science");
        Student student3=new Student("Aarav",4,"Bio");

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);

        for(Student var : studentArrayList){
            System.out.println("Printing student Arraylist "+var.getName());
            System.out.println("Printing student Arraylist "+var.getRollNo());
            System.out.println("Printing student Arraylist "+var.getSection());

        }
    }

    public static void main(String[] args) {
        ArrayListStudent obj=new ArrayListStudent();
        obj.createList();
    }
}