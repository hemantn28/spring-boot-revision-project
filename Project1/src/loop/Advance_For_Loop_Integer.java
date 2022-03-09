package loop;

public class Advance_For_Loop_Integer {
    public static void main(String[] args) {


        int age = 23;
        int age1 = 21;
        int age2 = 25;
        int age3 = 27;

        int ages[] = {23, 21, 25, 27};
        System.out.println(ages[2]);
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[3]);

        //syntax for advance for loop: for(datatype var: array){code}

        for(int var: ages){
            System.out.println("printing using advance for loop "+var);
        }

        double prices[]={23.1,45.6,89.1,74.1,36.2,85.2};
        System.out.println(prices[3]);

        //syntax for advance for loop: for(datatype var: array){code};

        for(double var: prices){
            System.out.println("printing prices using advanc efor loop: "+var);
        }

    }

}
