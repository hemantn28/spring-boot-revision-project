package class_and_object;

public class Animal {
    String name="Lion";
    int weight=178;
    String breed="Asian";

    public static void main(String[] args) {
        Animal obj=new Animal();
        System.out.println(obj.name);
        System.out.println(obj.weight);
        System.out.println(obj.breed);
    }
}
