package class_and_object;

public class Car {
    String name;
    int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public static void main(String[] args) {
        Car obj=new Car("Maruti", 110);
        System.out.println(obj.name+" "+obj.speed);

        Car obj2=new Car("Tata",115);
        System.out.println(obj2.name+" "+obj2.speed);

        Car obj3=new Car("Honda",125);
        System.out.println(obj3.name+" "+obj3.speed);
    }
}
