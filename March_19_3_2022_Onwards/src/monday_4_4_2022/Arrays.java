package monday_4_4_2022;

public class Arrays {
    public static void main(String[] args) {
        /*String names[]={"Balram","Himanshu","Kartik","Nagesh","Shreyas","Shivam","Rahul","Vikrant"};

        System.out.println(names[3]);

        System.out.println("printing thru for loop; ");
        for(int i=0;i<names.length;i++){
            System.out.print(names[i]);
            System.out.println(",");
        }

        System.out.println("printing thru for-each loop");
        for (String var:names){
            System.out.print(var);
            System.out.print(",");
        }*/

        int marks[]=new int[6];

        marks[0]=85;
        marks[1]=69;
        marks[2]=97;
        marks[3]=48;
        marks[4]=71;
        marks[5]=53;

        System.out.println(marks[4]);

        System.out.println("printing thru for-each loop");
        for (int var:marks){
            System.out.print(var);
            System.out.print(",");
        }

        System.out.println("printing thru for loop; ");
        for (int i=0; i< marks.length;i++){
            System.out.print(marks[i]);
            System.out.print(",");

        }

        int flats[][]=new int[2][3];

        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;

        System.out.println("printing a 2-d array using for loop");
        for (int i=0;i< flats.length;i++){
            for (int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(",");
            }
            System.out.println(" ");
        }








    }
}
