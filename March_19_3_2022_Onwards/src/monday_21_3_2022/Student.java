package monday_21_3_2022;

public class Student {
    String name;
    static String school;

    public static void changeSchool(){
        school="newschool";
    }


    public static void main(String[] args) {
        Student.school="ABC";
        Student sts1=new Student();
        sts1.name="Tony";
        System.out.println(sts1.school);
    }
}
