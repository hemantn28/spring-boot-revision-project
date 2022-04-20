package wednesday_20_4_2022;

public class DemoStatic {

    static int age=23;
    static int age1;

    public static void hello(){

        System.out.println("This is static method");

    }

    public static void main(String[] args) {
        DemoStatic.hello();
        System.out.println(DemoStatic.age);
        DemoStatic.age1=25;
        System.out.println(age1);

    }
}
