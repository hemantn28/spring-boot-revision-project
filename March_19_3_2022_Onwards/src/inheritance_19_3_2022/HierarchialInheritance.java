package inheritance_19_3_2022;

class University{
    String name;
    int age;

    public void teach(){
        System.out.println("University teaches students");
    }
}
class College extends University{

    public void training(){
        System.out.println("College trains students");
    }
}
class School extends University{
    public void play(){
        System.out.println("Students play here");
    }
}

public class HierarchialInheritance {
}
