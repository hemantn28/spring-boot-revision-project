package set;

import model.Student;

import java.util.HashSet;

public class SetStudent {

    public void createSet(){
        HashSet<Student> studentHashSet=new HashSet<>();

        Student student1=new Student("Deepak",15,"IT");
        System.out.println(student1.hashCode());
        Student student2=new Student("Deepak",15,"IT");
        System.out.println(student2.hashCode());
        Student student3=new Student("Sameer",35,"CS");
        System.out.println(student3.hashCode());
        Student student4=new Student("Neeraj",26,"ME");
        Student student5=new Student("Mukesh",26,"ME");
        System.out.println(student4.hashCode());

        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);
        studentHashSet.add(student4);
        studentHashSet.add(student5);

        for(Student var: studentHashSet){
            System.out.println("printing student obj "+var.getName() + "Hashcode "+var.hashCode());
        }
    }

    public static void main(String[] args) {
        SetStudent obj=new SetStudent();
        obj.createSet();
    }

}
