package conditionalstatement;

public class ConditionDemo {
    public static void main(String[] args) {
        //syntax: if(condition){code to be executed};
        //write a program of a person whose age is more than 18 and is eligible for voting.

        int age=14;

        if (age>18){
            System.out.println("Eligible for voting");
        }
        else{
            System.out.println("not eligible for voting");
        }
        int numbers=51;
        if (numbers>60){
            System.out.println("first division");
        }
        else{
            System.out.println("not first division");
        }
    }
}
