package arrays;

public class Arrays_Demo {

    public static void main(String[] args) {

        String cityname="Agra";
        String cityname1="Delhi";
        String cityname2="Jaipur";
        String cityname3="Chandigarh";

        //SYNTAX:    Datatype variablename []={value1,value2,value3....};

        String cities [] = {"Agra","Delhi","Jaipur","Chandigarh","Chennai"};
        System.out.println(cities [0]);
        System.out.println(cities [2]);
        System.out.println(cities [1]);
        System.out.println(cities [3]);
        System.out.println(cities [4]);

        // for loop
        for (int i=0; i<cities.length; i++){
            System.out.println("Printing Arraylist using for loop" + cities [i]);
        }
        // advance for loop: for (Datatype var: array){code}

        for  (String var: cities){
            System.out.println("printing using advance for loop"+var);
        }
        //SYNTAX:    Datatype variablename []={value1,value2,value3....};

        int marks []={56,85,79,53,48,91,63};
        for (int var: marks){
            System.out.println("printing marks array"+var);
        }
        double price []={98.5,56.3,74.1,69.2,15.4,38.5};
        for (double var: price){
            System.out.println("printing price array"+var);
        }



    }
}
