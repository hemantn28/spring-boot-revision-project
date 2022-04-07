package monday_21_3_2022;

class MyStudent{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name + age);
    }
}

public class PolyMorphisms {
    public static void main(String[] args) {
        MyStudent ms1=new MyStudent();
        ms1.name="Aman";
        ms1.age=24;

        ms1.printInfo(ms1.name+" "+ms1.age);

    }
}
