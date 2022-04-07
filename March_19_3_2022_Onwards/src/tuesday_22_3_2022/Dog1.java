package tuesday_22_3_2022;

import lombok.Data;

@Data
public class Dog1 {
    private String name;
    private int age;

    public void bark(){
        System.out.println("Dog barks");
    }
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
