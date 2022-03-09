package loop;

public class Arraylist5 {
    public static void main(String[] args) {
        //syntax for arrays: datatype var_name[]={value1,value2,value3.....};

        String bike="hero";
        String bike1="bajaj";
        String bike2="tvs";
        String bike3="honda";

        String bikes[]={"hero","bajaj","tvs","honda"};
        System.out.println(bikes[2]);

        //for loop
        for(int i=0; i< bikes.length; i++){
            System.out.println("printing using for loop: "+bikes[i]);
        }
    }
}
