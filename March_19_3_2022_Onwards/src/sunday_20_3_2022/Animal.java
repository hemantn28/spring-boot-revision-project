package sunday_20_3_2022;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Animal {
    private String name;
    private String color;

    public void hunt(){
        System.out.println("This animal can hunt");
    }

}
