package nested;

public class Nested_Programmes {

    public static void main(String[] args) {
// AND OPERATOR
        int age=13;
        String city="Delhi";

        if(age>18 && city=="Agra"){
            System.out.println("Eligible for voting in Aligarh");
        }
        else {
           System.out.println("not eligible");
        }
// NOT OPERATOR

        if(!(age>18 && city=="Agra")){
            System.out.println("Eligible for voting in Aligarh");
        }
        else {
            System.out.println("not eligible");
        }
// OR OPERATOR
        int marks=55;
        String subject="Bio";

        if(marks>60 || subject=="Maths"){
            System.out.println("First division in Maths");
        }
        else{
            System.out.println("No first division in Maths");

        }

    }
}
