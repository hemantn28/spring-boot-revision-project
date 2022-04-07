package getterandsetter_19_3_2022;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Bicycle {
     private String name;
     private int price;



    public void ride(){
        System.out.println("Bicycle is used for riding");
    }

    }
