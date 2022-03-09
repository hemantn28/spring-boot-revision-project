package class_and_object;

public class Sports {
    String name;
    String sports;

        //parameterized constructor


    public Sports(String name, String sports) {
        this.name = name;
        this.sports = sports;
    }

    public static void main(String[] args) {
        Sports obj=new Sports("Rafel Nadal","Tennis");
        System.out.println(obj.name+" "+obj.sports);

        Sports obj2=new Sports("Sachin Tendulkar","Cricket");
        System.out.println(obj2.name+" "+obj2.sports);

        Sports obj3=new Sports("Sania mirza","Tennis");
        System.out.println(obj3.name+" "+obj3.sports);


    }
}

