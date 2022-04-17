package exception_handling;

public class DemoCustomException2 {

    public void doVoting(int age) throws AgeNotEligibleException2{
        if (age<18){
            throw new AgeNotEligibleException2("Age is less than 18 so not eligible for voting.");
        }
        else{
            System.out.println("Welcome to voting app");
        }

    }
    public static void main(String[] args) {

        int age=17;

        DemoCustomException2 obj=new DemoCustomException2();
        try {
            obj.doVoting(age);
        } catch (AgeNotEligibleException2 e) {
            e.printStackTrace();
        }
    }
}
