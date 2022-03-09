package loop;

public class Advance_For_Loop {
    public static void main(String[] args) {
        String city="Agra";
        String city1="Agartala";
        String city2="Churu";
        String city3="Patna";

        String cities[]={"Agra","Agartala","Churu","Patna"};
        System.out.println(cities[1]);
        System.out.println(cities[3]);
        System.out.println(cities[2]);
        System.out.println(cities[0]);

        //syntax for advance for loop: for(datatype var: array){CODE};

        for(String var: cities){
            System.out.println("printing using advance for loop: "+var);
        }


    }

}
