package monday_21_3_2022;

interface Animal3{
    int eyes=2;
    void walk();
}
interface Herbivore{

}
class Horse3 implements Animal3,Herbivore{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Horse3 hs1=new Horse3();
        hs1.walk();
    }
}
