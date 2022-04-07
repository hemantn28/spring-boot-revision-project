package tuesday_22_3_2022;

interface Animal5{
    int eyes=2;
  public void walk();

}
interface Herbivore1{

}
abstract class Horse1 implements Animal5,Herbivore1{
    public void walks(){
        System.out.println("walks on 4 legs");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        /*Horse1 h1=new Horse1();
        h1.walks();*/
    }

}
