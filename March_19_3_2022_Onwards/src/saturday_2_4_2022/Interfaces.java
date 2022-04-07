package saturday_2_4_2022;

interface Animals2{
    void walk();

}
interface Herbivore{

}
class Donkey implements Animals2,Herbivore{

    @Override
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Donkey d1=new Donkey();
        d1.walk();

    }
}
