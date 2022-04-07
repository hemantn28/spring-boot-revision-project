package wednesday_23_3_2022;



public class Student {
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


    public static void main(String[] args) {
        Student s1=new Student();
        s1.printInfo("Shahid");
        s1.printInfo(23);
        s1.printInfo("Shahid",23);



    }
}
