package getterandsetter_19_3_2022;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
class Circles{
    double radius;

    public void area(double radius){
        double area=Math.PI*radius*radius;
        System.out.println("area is "+area);
    }

    public double circumference(){
        double circumference=2*Math.PI*radius;
        return circumference;
    }
}
@Getter
@Setter

public class State {
    private String name;
    private int age;



    public void live(){
        System.out.println("People live in state");
    }

}
