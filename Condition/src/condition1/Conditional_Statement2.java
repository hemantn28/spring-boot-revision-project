package condition1;

public class Conditional_Statement2 {

    public static void main (String [] args){

        //SYNTAX: if(condition){
        //
        ////            code to be executed
        //       }

        int age=10;

        if(age>18){

            System.out.println("Eligible for voting....");
        }
        else {
            System.out.println("Not eligible for voting");
        }

        String name="Bittoo";

        if(name=="Ravi"){
            System.out.println("Your name is Ravi");


        }
        else {
            System.out.println("Your name is not Ravi");
        }
        double price=125.25;

        if(price>500){
            System.out.println("product is costly");



        }
        else {
            System.out.println("product is not costly");
        }


    }
}
