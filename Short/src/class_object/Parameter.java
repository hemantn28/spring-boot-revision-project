package class_object;

public class Parameter {

    String name;
    int age;
    String section;

    //parameterised constructor


    public Parameter(String name, int age, String section) {
        this.name = name;
        this.age = age;
        this.section = section;
    }

    public static void main(String[] args) {

        //creating object : Classname object_name=new Classname(Value1,Value2,value3...);

        Parameter para1= new Parameter("Vijay", 20, "Hindi");

        System.out.println(para1.name+" "+para1.age+" "+para1.section);

        Parameter para2= new Parameter("Sachin",21,"Bio");

        System.out.println(para2.name+" "+para2.age+" "+para2.section);



    }
}
