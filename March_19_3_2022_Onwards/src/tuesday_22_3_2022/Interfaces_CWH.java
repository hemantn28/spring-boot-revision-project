package tuesday_22_3_2022;

interface Bicycle{
    int a=45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    int a=45;
    void applyBrakek3g();
    void speedUpmhn();
}
class AvonCycle implements Bicycle,HornBicycle{
    void blowHorn(){
        System.out.println("pee pee poo poo ");
    }
    public void applyBrake(int decrement){
        System.out.println("applying brake");
    }
    public void speedUp(int increment){
        System.out.println("applying speed up");
    }
    public void applyBrakek3g(){
        System.out.println("Kabhi khishi kabhi gham- pee pee pee");
    }
    public void speedUpmhn(){
        System.out.println("main hoon naa-poo poo poo ");
    }
}
public class Interfaces_CWH {
    public static void main(String[] args) {
        AvonCycle avc=new AvonCycle();
      //  avc.applyBrake(1);

       // System.out.println(avc.a);
        avc.applyBrakek3g();
        avc.speedUpmhn();

    }
}
