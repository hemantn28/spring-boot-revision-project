package parameterised_constructor;

public class Bike {
    String company_name;
    String model;
    double mileage;

    //parameterised constructor

    public Bike(String company_name, String model, double mileage) {
        this.company_name = company_name;
        this.model = model;
        this.mileage = mileage;
    }

    public static void main(String[] args) {
        Bike obj=new Bike("hero","splendor",72.5);
        System.out.println(obj.company_name);
        System.out.println(obj.model);
        System.out.println(obj.mileage);

        Bike obj1=new Bike("Bajaj","pulsar",53.6);
        System.out.println(obj1.company_name+obj1.model+obj1.mileage);

        Bike obj2=new Bike("TVS","Sport",65.0);
        System.out.println(obj2.company_name+" "+obj2.model+" "+obj2.mileage);
    }
}
