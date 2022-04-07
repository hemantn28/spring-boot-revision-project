package monday_21_3_2022;


class Shape{
    String color;

    public void area(){
        System.out.println("displays area");
    }
}
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);

    }
    class  EquilateralTriangle extends Triangle{
        public void area(int l, int h){
            System.out.println(1/2*l*h);
        }
    }
    class Circle extends Shape{
        public void area(int r){
            System.out.println(Math.PI*r*r);
        }
    }

}
public class Inheritances {
    public static void main(String[] args) {
        Triangle tc=new Triangle();
        tc.color="White";
        System.out.println(tc.color);


    }
}
