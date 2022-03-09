package nested;

public class NestedProgrammes {

    public static void main(String[] args) {
// AND OPERATOR
        double price=65.5;
        String product="Banana";

        if(price>60 && product=="Banana"){
            System.out.println("product is costly");
        }
        else{
            System.out.println("product is cheaper");
        }
        // NOT OPERATOR

        if(!(price>60 && product=="Banana")){
            System.out.println("product is costly");
        }
        else{
            System.out.println("product is cheaper");
        }
        //OR OPERATOR

        int marks=74;
        String subject="English";

        if(marks>60 || subject=="English"){
            System.out.println("first division in English");
        }

        int steps=8;
        String gender="girls";

        if(steps>9 || gender=="boys"){
            System.out.println("boys are fast");
        }
        else {
            System.out.println("boys are slower");
        }

        //NOT OPERATOR
        if(!(steps>9 || gender=="boys")){
            System.out.println("boys are fast");
        }
        else {
            System.out.println("boys are slower");
        }



    }
}
