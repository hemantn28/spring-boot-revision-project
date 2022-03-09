package loop;

public class Arrayloop {
    public static void main(String[] args) {
        String name="Rahul";
        String name1="Ramesh";
        String name2="Vikas";
        String name3="Saket";

        //syntax for arrays: datatype var_name[]={value1,value2,value3....};
        String names[]={"Rahul","Ramesh","Vikas","Saket"};
        System.out.println(names[1]);
        System.out.println(names[3]);
        System.out.println(names[2]);
        System.out.println(names[0]);

        //for loop
        for(int i=0; i< names.length; i++){
            System.out.println("printing arraylist using for loop "+names[i]);
        }
    }
}
