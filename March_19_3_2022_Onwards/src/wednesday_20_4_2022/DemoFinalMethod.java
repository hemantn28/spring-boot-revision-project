package wednesday_20_4_2022;

public class DemoFinalMethod {


    public final void message(){

        final int age=23;
       /* if (age==23){
            age=25;
        }*/
        System.out.println("This is final method");

    }

    public static void main(String[] args) {
        DemoFinalMethod obj=new DemoFinalMethod();

    }
}
