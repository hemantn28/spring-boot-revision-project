package parameterised_constructor;

public class Serials {

    String name;
    String channel;
    double time;

    //parameterised constructor

    public Serials(String name, String channel, double time) {
        this.name = name;
        this.channel = channel;
        this.time = time;
    }

    public static void main(String[] args) {
        Serials obj=new Serials("BAlika vadhu","Colors",08.00);
        System.out.println(obj.name+obj.channel+obj.time);

        Serials obj1=new Serials("Mashaal","doordarshan",09.30);
        System.out.println(obj1.name+" "+obj1.channel+" "+obj1.time);

        Serials std=new Serials("KBC","Star Plus",09.30);
        System.out.println(std.name);
        System.out.println(std.channel);
        System.out.println(std.time);
    }
}
