package condition1;

public class Conditional_Statement {

    public static void main (String [] args){

        int age=16;

        if (age>18) {

            System.out.println("eligible for voting...");
        }
        else {
            System.out.println("not eligible for voting...");
        }

        String cityname="Mumbai";

        if (cityname=="Pune"){
            System.out.println("You are in Pune");
        }

        else {
            System.out.println("You are not in Pune");
        }

        double price=1500.36;




        if (price>3000){
            System.out.println("product is costly");
        }
        else {
            System.out.println("product is not costly");

        }
    }


}
