package wednesday_23_3_2022;

public class Student4 {
    String name;
    static String school;

    public static void changeSchool(){
        school="new school";
    }

    public static void main(String[] args) {

        Student4.school="Cambridge";
        System.out.println(Student4.school);
    }

}
