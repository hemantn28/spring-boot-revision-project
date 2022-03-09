package loop;

public class Arraylist4 {
    public static void main(String[] args) {
        //syntax for arrays: datatype var_name[]={value1,value2,value3....};

        double price=98.5;
        double price1=48.6;
        double price2=91.7;
        double price3=63.4;

        double prices[]={98.8,48.6,91.7,63.4,85.0,15.7};
        System.out.println(prices[3]);
        System.out.println(prices[5]);
        System.out.println(prices[1]);
        System.out.println(prices[4]);
        System.out.println(prices[2]);
        System.out.println(prices[0]);

        //for loop
        for(int i=0; i<prices.length; i++){
            System.out.println("printing prices using for loop "+prices[i]);
        }
    }
}
