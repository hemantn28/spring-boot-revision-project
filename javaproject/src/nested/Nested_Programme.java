package nested;

public class Nested_Programme {

    public static void main(String[] args) {

        int age=13;
        String city="Delhi";
// AND OPERATOR

        if(age>18 && city=="Agra"){

            System.out.println("eligible for voting in Agra");
        }
        else {
            System.out.println("not eligible");
        }
// NOT OPERATOR

        if(!(age>18 && city=="Agra")){

            System.out.println("eligible for voting in Agra");
        }
        else {
            System.out.println("not eligible");
        }
// OR OPERATOR

        int marks=55;
        String subject="Hindi";

        if(marks>60 || subject=="Maths"){
            System.out.println("First division in Maths");
        }
        else{
            System.out.println("No first division in Maths");
                    
        }
// NOT OPERATOR

        if(!(marks>60 || subject=="Maths")){
            System.out.println("First division in Maths");
        }
        else{
            System.out.println("No first division in Maths");

        }



    }


}
