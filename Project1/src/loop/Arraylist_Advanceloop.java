package loop;

public class Arraylist_Advanceloop {
    public static void main(String[] args) {
        //syntax for array: datatype var_name[]={value1,value2,value3.....};

        int age=23;
        int age1=25;
        int age2=14;
        int age3=19;

        int ages[]={23,25,14,19,21};
        System.out.println(ages[2]);
        System.out.println(ages[1]);
        System.out.println(ages[0]);
        System.out.println(ages[3]);
        System.out.println(ages[4]);

        //for loop
        for(int i=0; i< ages.length; i++){
            System.out.println("printing ages using for loop "+ages[i]);
        }
    }
}
