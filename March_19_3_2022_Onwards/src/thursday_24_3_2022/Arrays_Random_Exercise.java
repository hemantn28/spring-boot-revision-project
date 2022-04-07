package thursday_24_3_2022;

public class Arrays_Random_Exercise {
    public static void main(String[] args) {
        //print an array of cities.

        String []cities={"Agra","Jaipur","Ludhiana","Kanpur","Saharanpur","Meerut"};

        System.out.println(cities[0]);
        System.out.println(cities.length);
        for (String var: cities){
            System.out.println(var);
        }
        //print an array of salary of employees.

        double [] salary= new double[6];
        salary[0]=56412.52;
        salary[1]=45786.25;
        salary[2]=85476.10;
        salary[3]=45987.40;
        salary[4]=63254.94;
        salary[5]=34785.74;

        System.out.println(salary.length);
        System.out.println(salary[4]);

        for (int i=0; i< salary.length; i++){
            System.out.println(salary[i]);
        }
        //print numbers in an array.

        int num[]= new int[8];

        num[0]=54;
        num[1]=85;
        num[2]=71;
        num[3]=91;
        num[4]=69;
        num[5]=31;
        num[6]=11;
        num[7]=9;

        for (int var: num){
            System.out.println(var);
        }

        System.out.println(num.length);
        System.out.println(num[5]);
    }
}
