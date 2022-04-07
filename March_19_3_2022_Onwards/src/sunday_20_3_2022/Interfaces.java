package sunday_20_3_2022;

interface Animal2{
    int eyes=2;
  public  void walk();
}
interface Herbivore{

}

class Horse1 implements Animal2, Herbivore{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Horse1 hrs=new Horse1();
        hrs.walk();
    }
}
