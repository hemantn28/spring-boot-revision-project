package friday_8_4_2022;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Data
public class Bike {
    String name;
    String model;
    int price;

    public Bike(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }
}
