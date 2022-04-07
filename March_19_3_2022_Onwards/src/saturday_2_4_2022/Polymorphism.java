package saturday_2_4_2022;


class Student1{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name+" "+age);
    }

}

public class Polymorphism {
    public static void main(String[] args) {
        Student1 st1=new Student1();
        st1.printInfo(21);
        st1.printInfo("Sakshi");
        st1.printInfo("Sakshi",21);
    }
}
