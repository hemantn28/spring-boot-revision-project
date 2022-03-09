package loop;

public class Arrays {
    public static void main(String[] args) {
        //syntax for arrays: datatype var_name[]={value1,value2,value3.....};

        String city="Agra";
        String city1="Agartala";
        String city2="Churu";
        String city3="Patna";

        String cities[]={"Agra","Agartala","Churu","Patna"};
        System.out.println(cities[1]);
        System.out.println(cities[3]);
        System.out.println(cities[2]);
        System.out.println(cities[0]);

        //for loop
        for(int i=0; i<cities.length; i++){
            System.out.println("printing Arraylist using for loop "+cities[i]);
        }
    }
}
