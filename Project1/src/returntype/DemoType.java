package returntype;

public class DemoType {
    public String measure(){
        String instrument="Tape";
        return instrument;
    }

    public double measeurespeed(){
        double speed=85.5;
        return speed;
    }
    public int makesquare(int number){
        int square=number*number;
        return square;
    }
    public int makecube(int number){
        int cube=number*number*number;
        return cube;
    }

    public static void main(String[] args) {
        DemoType neo=new DemoType();
        String instrument=neo.measure();
        System.out.println("This is measure method "+instrument);

        double speed=neo.measeurespeed();
        System.out.println("Speed is "+speed);

        int square=neo.makesquare(5);
        System.out.println("Square is "+square);

        int cube=neo.makecube(19);
        System.out.println("Cube of given number is "+cube);
    }
}
