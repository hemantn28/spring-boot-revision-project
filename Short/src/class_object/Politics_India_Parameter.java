package class_object;

public class Politics_India_Parameter {

    String name;
    int age;
    String party;

    public Politics_India_Parameter(String name, int age, String party) {
        this.name = name;
        this.age = age;
        this.party = party;
    }

    public static void main(String[] args) {

        Politics_India_Parameter obj1=new Politics_India_Parameter("Yogi Adityanath", 47,"BJP");
        System.out.println(obj1.name+" "+obj1.age+" "+obj1.party);

        Politics_India_Parameter obj2=new Politics_India_Parameter("Amit Shah",56,"BJP");
        System.out.println(obj2.name+" "+obj2.age+" "+obj2.party);

        Politics_India_Parameter obj3=new Politics_India_Parameter("Arvind kejriwal",54,"AAP");
        System.out.println(obj3.name+" "+obj3.age+" "+obj3.party);


    }
}
