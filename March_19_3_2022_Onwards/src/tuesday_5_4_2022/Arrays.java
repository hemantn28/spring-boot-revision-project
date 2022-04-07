package tuesday_5_4_2022;

public class Arrays {
    public static void main(String[] args) {
       // String subjects[]={"Maths","Science","History","English","Hindi","Arts"};

        /*System.out.println("printing thru for loop; ");
        for (int i=0; i< subjects.length;i++){
            System.out.print(subjects[i]);
            System.out.print(",");
        }*/

       /* System.out.println("printing thru for-each loop");
        for (String var: subjects){
            System.out.print(var);
            System.out.print(",");
        }
        System.out.println(subjects[5]);*/

       /*  double price[]= new double[6];

        price[0]=85.6;
        price[1]=12.8;
        price[2]=63.2;
        price[3]=90.7;
        price[4]=71.9;
        price[5]=45.3;

       // System.out.println(price[4]);
       System.out.println("printing thru for-each loop");
        for (double var:price){
            System.out.println(var);
        }*/
       /* System.out.println("printing thru for loop; ");
        for (int i=0;i< price.length; i++){
            System.out.print(price[i]);
            System.out.print(",");
        }*/

        /*int marks[]=new int[10];

        marks[0]=85;
        marks[1]=47;
        marks[2]=98;
        marks[3]=51;
        marks[4]=74;
        marks[5]=69;
        marks[6]=38;
        marks[7]=47;
        marks[8]=80;
        marks[9]=64;

        System.out.println("printing thru for loop; ");

        for (int i=0; i<marks.length; i++){
            System.out.print(marks[i]);
            System.out.print(",");
        }*/

        /*System.out.println("printing thru for-each loop");
        for (int var:marks){
            System.out.print(var);
            System.out.print(",");
        }*/

        //System.out.println(marks.length);

        //String [] countries={"India","China","Russia","Cuba","Mexico","Canada","Peru","Spain","France","Germany"};

       /* System.out.println(countries.length);
        System.out.println(countries[5]);
        System.out.println("Printing thru for-each loop: ");
        for (String var: countries){
            System.out.print(var);
            System.out.print(",");
        }
        System.out.println("Printing thru for loop: ");
        for (int i=0; i< countries.length;i++){
            System.out.print(countries[i]);
            System.out.print(",");
        }*/

        int flats[][]= new int[2][3];

        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;

        //System.out.println(flats.length);

        System.out.println("Printing thru for loop: ");
        for (int i=0; i< flats.length; i++){
            for (int j=0; j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");

        }







    }
}
