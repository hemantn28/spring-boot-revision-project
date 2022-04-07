package monday_21_3_2022;

 interface Bicycle {
      int a=45;
    void applyBreak(int decrement);
    void speedUp(int increment);

}
interface HornBicycle{
     void blowHornk3g();
     void blowhornmhn();
}

class AvonCycle implements Bicycle, HornBicycle{
    void blowHorn(){
        System.out.println("pee ee poo poo");
    }
   public void applyBreak(int decrement){
        System.out.println("applying break");
    }
    public void speedUp(int increment){
        System.out.println("applying speed up");
    }
   public void blowHornk3g(){
        System.out.println("kabhi khushi kabhi gham pee pee pee pee");
    }
    public void blowhornmhn(){
        System.out.println("main hoon na po po po ");
    }

}
public class Interface {
    public static void main(String[] args) {
        AvonCycle ac=new AvonCycle();
        ac.applyBreak(1);

        //System.out.println(ac.a);
        ac.blowHornk3g();
        ac.blowhornmhn();

    }
}
