package parameterised_constructor;

public class Mango {
    String breed;
    String quality;
    double price;

    //parameterised constructor

    public Mango(String breed, String quality, double price) {
        this.breed = breed;
        this.quality = quality;
        this.price = price;
    }

    public static void main(String[] args) {
        Mango sweet=new Mango("Dussehri","good",40);
        System.out.println(sweet.breed+" "+sweet.quality+" "+sweet.price);

        Mango ripe=new Mango("Chausa","better",50);
        System.out.println(ripe.breed+ripe.quality+ripe.price);

        Mango mix=new Mango("kalmi","best",60);
        System.out.println(mix.breed);
        System.out.println(mix.quality);
        System.out.println(mix.price);
    }
}
