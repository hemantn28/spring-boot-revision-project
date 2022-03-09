package conditions;

public class Conditions_Nested {

    public static void main(String[] args) {

        int age=13;
        String cityname="Delhi";
// AND OPERATOR

        if(age>18 && cityname=="Agra"){

            System.out.println("eligible for voting in Agra");
        }
        else {
            System.out.println("not eligible for voting in Agra");
        }



// OR OPERATOR

        int marks=74;
        String subject="Bio";

        if(marks>75 || subject=="Maths"){
            System.out.println("First division in Maths");
        }
        else {
            System.out.println("Not in Maths subject neither first division");
        }

// NOT OPERATOR
            if(!(marks>75) || ! (subject=="Maths")){
                System.out.println("First division in Maths");
            }
            else {
                System.out.println("Not in Maths subject neither first division");
            }



    }
}
