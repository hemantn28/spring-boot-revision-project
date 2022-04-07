package wednesday_23_3_2022;

import lombok.Data;

@Data
public class Animal {

    private String name;
    private String color;

    public void eat(){
        System.out.println("munch");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Dog1 extends Animal{
    private int breed;

    public void eat(){
        System.out.println("chomp chomp");
    }

    public int getBreed() {
        return breed;
    }

    public void setBreed(int breed) {
        this.breed = breed;
    }
}