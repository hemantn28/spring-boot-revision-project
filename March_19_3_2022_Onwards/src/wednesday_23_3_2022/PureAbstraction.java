package wednesday_23_3_2022;

interface Animal4{
    void walk();

}
interface Herbivore{

}
class Horse2 implements Animal4,Herbivore{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}

public class PureAbstraction {
    public static void main(String[] args) {

    }
}
