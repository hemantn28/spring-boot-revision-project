package sunday_20_3_2022;

class MyStudent{
    String name;
    static String school;

    public static void changeSchool(){
        school="new school";
    }
}

public class Static {
    public static void main(String[] args) {
        MyStudent.school="DAV";
        MyStudent std=new MyStudent();
        std.name="Tony";
        System.out.println(std.school);
    }
}
