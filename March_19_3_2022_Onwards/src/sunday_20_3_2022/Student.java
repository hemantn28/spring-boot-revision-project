package sunday_20_3_2022;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Student {
    private String name;
    private String rollNo;

    public void display(){
        System.out.println(this.name);
        System.out.println(this.rollNo);
    }
}
