package monday_18_4_2022_imp_concepts;

public class DemoStatic {

    static int age=23;

    public static void message(){

        System.out.println("This is Static method.");
    }

    public static void main(String[] args) {
        DemoStatic.message();
        System.out.println(DemoStatic.age);
    }
}
