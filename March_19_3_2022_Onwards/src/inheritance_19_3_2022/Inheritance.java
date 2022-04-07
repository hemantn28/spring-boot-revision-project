package inheritance_19_3_2022;

import lombok.Getter;
import lombok.Setter;

class Vehicle{
    String name;
    String color;

    Vehicle(){
        System.out.println("I am a vehicle");
    }

    public void speed(){
        System.out.println("speed is very high");
    }
}
@Getter
@Setter
class Bus extends Vehicle{
    String type;

    Bus(){
        System.out.println("I am bus");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void size(){
        System.out.println("Bus is of big size");
    }
}
class MiniBus extends Bus{
    public void space(){
        System.out.println("This minibus is spacious");
    }

}
public class Inheritance {
    public static void main(String[] args) {
        //Vehicle vhc=new Vehicle();
        Bus bs=new Bus();





    }

}
