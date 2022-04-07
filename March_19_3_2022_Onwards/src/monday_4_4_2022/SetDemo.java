package monday_4_4_2022;

import javafx.scene.effect.SepiaTone;

import java.util.HashSet;

public class SetDemo {
    public void createSet(){
        HashSet<Integer> myHashSet=new HashSet<>();

        myHashSet.add(5);
        myHashSet.add(6);
        myHashSet.add(3);
        myHashSet.add(2);
        myHashSet.add(1);
        myHashSet.add(5);

        for (int var:myHashSet){
            System.out.println(var);
        }
        HashSet<String> myStringHashSet=new HashSet<>();

        myStringHashSet.add("Kapil");
        myStringHashSet.add("Naresh");
        myStringHashSet.add("Mahesh");
        myStringHashSet.add("Rajkumar");
        myStringHashSet.add("Kapil");
        myStringHashSet.add("Sachin");

        for (String var:myStringHashSet){
            System.out.println(var);
        }

        HashSet<Double> myDoubleHashSet=new HashSet<>();

        myDoubleHashSet.add(89.32);
        myDoubleHashSet.add(45.12);
        myDoubleHashSet.add(98.71);
        myDoubleHashSet.add(81.07);
        myDoubleHashSet.add(89.32);
        myDoubleHashSet.add(71.35);

        for (double var:myDoubleHashSet){
            System.out.println(var);
        }

        HashSet<Student> studentHashSet=new HashSet<>();

        Student st1=new Student("Aftab Alam",1,"IT");
        Student st2=new Student("Afroz",1,"IT");
        Student st3=new Student("Vazid Ali",45,"IT");
        Student st4=new Student("Shahid",40,"IT");

        studentHashSet.add(st1);
        studentHashSet.add(st2);
        studentHashSet.add(st3);
        studentHashSet.add(st4);

        for(Student var:studentHashSet){
            System.out.println(var.getName());
        }
    }


    public static void main(String[] args) {
        SetDemo obj=new SetDemo();
        obj.createSet();
    }
}
