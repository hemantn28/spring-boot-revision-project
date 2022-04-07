package tuesday_22_3_2022;

interface Camera1{
    void takeSnap();
    void recordVideo();
    default void record4kVideo(){
        System.out.println("recording 4k video");
    }
}
interface Wifi1{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class Cellphone1{
    void callNumber(int phoneNumber){
        System.out.println("calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting... ");
    }
}
class Smartphone1 extends Cellphone1 implements Wifi1,Camera1{
    public void takeSnap(){
        System.out.println("taking snap");
    }
    public void recordVideo(){
        System.out.println("taking snap");
    }
    public String[] getNetworks(){
        System.out.println("getting list of networks");
        String[] networkList={"Vikas","Rahul","Mayank"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("connecting to "+network);
    }
}
public class InterfaceMethod {
    public static void main(String[] args) {
        Smartphone1 smp1=new Smartphone1();
        String[] ar=smp1.getNetworks();
        for(String item: ar){
            System.out.println(item);
        }
        smp1.record4kVideo();
    }
}
