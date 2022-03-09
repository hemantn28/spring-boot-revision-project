package firstproject;

public class Nested_If_Else {
    public static void main(String[] args) {
        //write a program in which user age is >18 and he lives in Aligarh. Eligible or not eligible for voting.
        // AND OPERATOR
        int age=19;
        String city="Aligarh";
        /*if(age>18 && city=="Aligarh"){
            System.out.println("Eligible for voting");
        }
        else{
            System.out.println("Not eligible");
        }
        // OR OPERATOR
        //write a program in which user has marks >60 in maths. first division or not.

        int marks=68;
        String subject="Hindi";
        if(marks>60 || subject=="Maths"){
            System.out.println("First division in Maths");
        }
        else {
            System.out.println("Not first division");
        }*/

        //NOT OPERATOR

        if(age>18 && !(city=="Aligarh")){
            System.out.println("Eligible for voting");
        }
        else{
            System.out.println("Not eligible");
        }
        //NOT OPERATOR

        int mark=68;
        String subjects="Maths";
        if(!(mark>60 || subjects=="Maths")){
            System.out.println("First division in Maths");
        }
        else {
            System.out.println("Not first division");
        }


        }
}
