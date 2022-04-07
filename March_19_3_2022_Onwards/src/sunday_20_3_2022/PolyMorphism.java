package sunday_20_3_2022;

class Student3{
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
public class PolyMorphism {
    public static void main(String[] args) {
        Student3 std1=new Student3();
        std1.name="Ansh";
        std1.age=21;
        std1.printInfo(std1.name,std1.age);
    }

}
