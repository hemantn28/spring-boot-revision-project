package thursday_24_3_2022;

interface Animal{
    void walk();
    void eat();
}
interface Herbivore{

}
class Horse implements Animal,Herbivore{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
    public void eat(){
        System.out.println("walks on 2 legs");
    }
}
public class MyInterfaces {
    public static void main(String[] args) {

    }
}
