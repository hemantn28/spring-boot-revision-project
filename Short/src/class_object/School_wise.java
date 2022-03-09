package class_object;

public class School_wise {

    //data member

    String name="Sagar";
    double percentage=91.2;
    String school= "N R Inter College";

    public static void main(String[] args) {

        //creating object: Classname object name=new Classname();

        School_wise school=new School_wise();

        System.out.println(school.name);
        System.out.println(school.percentage);
        System.out.println(school.school);

    }
}
