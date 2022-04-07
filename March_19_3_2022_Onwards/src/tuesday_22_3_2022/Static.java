package tuesday_22_3_2022;


class Student5{
    String name;
    static String school;

}
public class Static {
    public static void main(String[] args) {
        Student5.school="ABC";
        Student5 std5=new Student5();
        std5.name="Shiv";
        System.out.println(Student5.school);
    }

}
