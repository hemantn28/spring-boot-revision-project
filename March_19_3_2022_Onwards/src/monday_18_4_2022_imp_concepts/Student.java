package monday_18_4_2022_imp_concepts;

public class Student {
    String name;
    static String school;

    public static void changeSchool(){
        school="newschool";
    }

    public static void main(String[] args) {
        Student.school="DAV";
        Student std1=new Student();
        std1.name="Tony";
        System.out.println(Student.school);
    }

}

