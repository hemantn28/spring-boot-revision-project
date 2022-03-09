package class_object;

public class Locality {

    String colony;
    int population;
    String city;

    public Locality(String colony, int population, String city) {
        this.colony = colony;
        this.population = population;
        this.city = city;
    }

    public static void main(String[] args) {

        Locality local=new Locality("lajpat nagar",35621,"ghaziabad");

        System.out.println(local.colony+" "+local.population+" "+local.city);

        Locality local2=new Locality("sanjay place",23015,"Agra");

        System.out.println(local2.colony+" "+local2.population+" "+local2.city);

        Locality local3=new Locality("marris road",10236,"Aligarh");

        System.out.println(local3.colony+" "+local3.population+" "+local3.city);

        Locality local4=new Locality("dariyaganj",56321,"delhi");

        System.out.println(local4.colony+" "+local4.population+" "+local4.city);

        Locality local5=new Locality("pari chowk",10236,"noida");

        System.out.println(local5.colony+" "+local5.population+" "+local5.city);





    }
}
