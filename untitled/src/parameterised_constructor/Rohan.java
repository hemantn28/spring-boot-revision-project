package parameterised_constructor;

public class Rohan {
    String name;
    int age;
    String colony;

    //parameterised constructor

    public Rohan(String name, int age, String colony) {
        this.name = name;
        this.age = age;
        this.colony = colony;
    }

    public static void main(String[] args) {
        Rohan uid=new Rohan("Rohan",12,"Lajpat nagar");
        System.out.println(uid.name+" "+uid.age+" "+uid.colony);

        Rohan erd=new Rohan("Himanshu",15,"Nehru nagar");
        System.out.println(erd.name+erd.age+erd.colony);

        Rohan eddy=new Rohan("Dharmesh",16,"Khandari");
        System.out.println(eddy.name);
        System.out.println(eddy.age);
        System.out.println(eddy.colony);

    }
}
