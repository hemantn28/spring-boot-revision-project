package class_object;

public class MarksOfStudents {

    String name;
    int standard;
    String subject;
    double marks;
    String school;

    public MarksOfStudents(String name, int standard, String subject, double marks, String school) {
        this.name = name;
        this.standard = standard;
        this.subject = subject;
        this.marks = marks;
        this.school = school;
    }

    public static void main(String[] args) {

        MarksOfStudents sch1=new MarksOfStudents("Nitin",5,"Hindi",65.5,"N R Inter College");
        System.out.println(sch1.name+" "+sch1.standard+" "+sch1.subject+" "+sch1.marks+" "+sch1.school);

        MarksOfStudents sch2=new MarksOfStudents("Alok",6,"Geography",55.5,"M S School");
        System.out.println(sch2.name+" "+sch2.standard+" "+sch2.subject+" "+sch2.marks+" "+sch2.school);

        MarksOfStudents sch3=new MarksOfStudents("Karan",7,"SST",63.5,"Thakur Biri singh");
        System.out.println(sch3.name+" "+sch3.standard+" "+sch3.subject+" "+sch3.marks+" "+sch3.school);

        MarksOfStudents sch4=new MarksOfStudents("Sameer",8,"Sanskrit",51.5,"DPS");
        System.out.println(sch4.name+" "+sch4.standard+" "+sch4.subject+" "+sch4.marks+" "+sch4.school);

    }
}
