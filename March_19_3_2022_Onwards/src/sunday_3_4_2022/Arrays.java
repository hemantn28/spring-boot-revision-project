package sunday_3_4_2022;

public class Arrays {
    public static void main(String[] args) {
        /*String names[]={"Narayan","Kamal","himesh","Rashid","Paras","Patel","Sameer","Bhuvan","Nitin","Mukesh"};

        System.out.println(names[9]);
        System.out.println("printing thru for loop; ");
        for (int i=0; i< names.length; i++){
            System.out.println(names[i]);
        }
        System.out.println("printing thru for-each loop");
        for (String var: names){
            System.out.println(var);
        }*/

        int marks[]= new int[6];

        marks[0]=97;
        marks[1]=71;
        marks[2]=84;
        marks[3]=43;
        marks[4]=68;
        marks[5]=55;

        System.out.println(marks[4]);

        System.out.println("printing thru for-each loop");
        for (int var: marks){
            System.out.println(var);
        }
        System.out.println("printing thru for loop; ");
        for (int i=0; i< marks.length; i++){
            System.out.println(marks[i]);
        }
        int flats[][]=new int[2][3];

        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;

        System.out.println("printing a 2-d array using for loop");
        for (int i=0; i< flats.length; i++){
            for (int j=0; j<flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
