package class_object;

public class States_Cities {

    String cityname;
    String statename;
    int population;

    public States_Cities(String cityname, String statename, int population) {
        this.cityname = cityname;
        this.statename = statename;
        this.population = population;
    }

    public static void main(String[] args) {
        States_Cities city=new States_Cities("Agra","UP",1532604);
        System.out.println(city.cityname+" "+city.statename+" "+city.population);

        States_Cities city2=new States_Cities("Bhopal","MP",2236547);
        System.out.println(city2.cityname+" "+city2.statename+" "+city2.population);

        States_Cities city3=new States_Cities("Pune","Maharashtra",2365103);
        System.out.println(city3.cityname+" "+city3.statename+" "+city3.population);

    }
}
