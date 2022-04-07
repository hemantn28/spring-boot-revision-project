package getterandsetter_19_3_2022;

class Truck{
    String name;
    String type;

    public Truck(String name, String type) {
        this.name = name;
        this.type = type;
    }
}
class Hospital{
    String name;
    String address;

    public Hospital(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
public class Constructor {
    public static void main(String[] args) {
        Truck tck=new Truck("Tata","diesel");
        System.out.println(tck.name+" "+tck.type);

        Truck tck2=new Truck("Mercedes","CNG");
        System.out.println(tck2.name+" "+tck2.type);

        Truck tck3=new Truck("Ashok Leyland","Petrol");
        System.out.println(tck3.name+" "+tck3.type);

        Hospital hsp=new Hospital("Apollo","New delhi");
        System.out.println(hsp.name+" "+hsp.address);

        Hospital hsp2=new Hospital("Medanta","Lucknow");
        System.out.println(hsp2.name+" "+hsp2.address);





    }
}
