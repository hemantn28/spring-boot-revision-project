package tuesday_22_3_2022;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student7 {
    //Getter & Setter
    private String name;
    private int rollNo;

    public void display(){
        System.out.println(this.name);
        System.out.println(this.rollNo);
    }

}

