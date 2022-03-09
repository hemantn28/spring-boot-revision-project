package class_object;

public class Country_Wise {

    //data member

    String city="London";
    String country="England";
    int population=25036269;

    public static void main(String[] args) {

        //creating object: Classname objectname=new Classname();

        Country_Wise city=new Country_Wise();

        System.out.println(city.city+" "+city.country+" "+city.population);
    }
}
