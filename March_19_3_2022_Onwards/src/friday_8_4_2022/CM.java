package friday_8_4_2022;

import lombok.Data;

@Data
public class CM {
    String name;
    String state;
    int age;

    public CM(String name, String state, int age) {
        this.name = name;
        this.state = state;
        this.age = age;
    }
}
