package class_object;

public class Serials_India {

    String name;
    double timing;
    String channel;

    public Serials_India(String name, double timing, String channel) {
        this.name = name;
        this.timing = timing;
        this.channel = channel;
    }

    public static void main(String[] args) {

        Serials_India drama=new Serials_India("AlifLaila",09.00,"Doordarshan");
        System.out.println(drama.name+" "+drama.timing+" "+drama.channel);

        Serials_India drama2=new Serials_India("IndianIdol",09.30,"Sony");
        System.out.println(drama2.name+" "+drama2.timing+" "+drama2.channel);

        Serials_India drama3=new Serials_India("KBC",08.30,"Star plus");
        System.out.println(drama3.name+" "+drama3.timing+" "+drama3.channel);


    }
}
