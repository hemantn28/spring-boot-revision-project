package tuesday_22_3_2022;

interface Camera{
    void takeSnap();
    void recordVideo();

    default void record4kVideo(){
        System.out.println("record 4k");
    }

}
interface Wifi{
    String [] getNetworks();
    void connectToNetwork(String network);
}
class CellPhone{
    void callNumber(int phoneNumber){
        System.out.println("calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }
}

class SmartPhone extends CellPhone implements Wifi,Camera{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("");
    }
   public void record4kVideo(){
      System.out.println("taking snap and recording in 4k");
   }
    public String [] getNetworks(){
        System.out.println("getting list of networks");
        String[]networkList={"Harry","Prashant","Anjali"};
        return networkList;
    }
        public void connectToNetwork(String networks){
            System.out.println("Connecting to "+networks);
        }

}

public class Interface_Methods {
    public static void main(String[] args) {
        SmartPhone smp=new SmartPhone();
        String[] ar=smp.getNetworks();
        for (String item: ar){
            System.out.println(item);
        }
        smp.record4kVideo();


    }
}
