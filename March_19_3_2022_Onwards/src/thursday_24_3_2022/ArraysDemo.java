package thursday_24_3_2022;

public class ArraysDemo {
    public static void main(String[] args) {
        //Syntax of Arrays: Datatype Variable_name [] = {value1, value2, value3....};

        String names[]={"Ramesh","Akash","Sahil","Mayank","Shivam","Mani","Krishna","Bittoo"};
        System.out.println(names[3]);

        System.out.println("printing thru for loop: ");
        for (int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }
        System.out.println("printing thru for-each loop: ");

        for (String var:names)
        {
            System.out.println(var);
        }
        int marks[]={98,45,76,32,58,69,81,43,61};
        System.out.println(marks[1]);
        System.out.println(marks.length);

        System.out.println("printing thru for loop: ");
        for (int i=0; i< marks.length; i++){
            System.out.println(marks[i]);
        }
        System.out.println("printing thru for-each loop: ");

        for (int var: marks){
            System.out.println(var);
        }
        double [] price={45.5,63.2,87.1,36.1,91.0,45.15};

        System.out.println(price[5]);
        System.out.println(price.length);

        System.out.println("printing thru for loop: ");
        for (int i=0; i< price.length; i++){
            System.out.println(price[i]);
        }

        System.out.println("printing thru for-each loop: ");
        for (double element:price){
            System.out.println(element);
        }
        System.out.println("printing thru for loop in reverse order: ");

        for (int i= price.length; i>0; i--){
            System.out.println(price[i]);
        }



    }
}
