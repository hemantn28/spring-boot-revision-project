package tuesday_22_3_2022;

interface Bicycle1{
    int a=45;
    void applyBrake(int decrement);
    void speedUp(int increment);

}
interface HornBicycle1{
    int a=45;
    void blowHornk3g();
    void blowHornmhn();
}

class AvonCycle1 implements Bicycle1, HornBicycle1{
    void blowHorn(){
        System.out.println("pee pee poo poo");
    }
   public void applyBrake(int decrement){
        System.out.println("applying brake");
    }
    public void speedUp(int increment){
        System.out.println("applying speed up");
    }
    public void blowHornk3g(){
        System.out.println("kabhi khushi kabhi gham- pee pee pee pee");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon naa- poo poo poo poo");
    }

}
public interface Interface {
    public static void main(String[] args) {
        AvonCycle1 ac1=new AvonCycle1();
        ac1.applyBrake(1);
        //System.out.println(ac1.a);
        ac1.blowHornk3g();
        ac1.blowHornmhn();

    }
}
