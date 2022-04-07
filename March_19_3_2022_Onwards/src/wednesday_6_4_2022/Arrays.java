package wednesday_6_4_2022;

public class Arrays {
    public static void main(String[] args) {
        //syntax1: Datatype Variable_name[]={value1,value2,value3.....};
        //syntax2: Datatype Variable_name[]=new Datatype[];

       // String cricketers[]={"Kumble","Ricky","Sachin","Vinod","Virat","Rohit","Zaheer","Sourav"};


        //System.out.println(cricketers[5]);
       /* System.out.println("Printing Thru For Loop: ");
        for (int i=0; i< cricketers.length;i++){
            System.out.print(cricketers[i]);
            System.out.print(",");
        }

        System.out.println(" ");
        System.out.println("\n");
        System.out.println("Printing Thru For-Each Loop: ");
        for (String var: cricketers){
            System.out.print(var);
            System.out.print(",");
        }*/

        /*int marks[]=new int[6];

        marks[0]=85;
        marks[1]=71;
        marks[2]=69;
        marks[3]=44;
        marks[4]=91;
        marks[5]=56;

        System.out.println(marks.length);
        System.out.println(marks[5]);

        System.out.println("Printing Thru For-Each Loop: ");
        for (int var:marks){
            System.out.print(var);
            System.out.print(",");
        }
        System.out.println("\n");

        System.out.println("Printing Thru For Loop: ");
        for (int i=0;i< marks.length;i++){
            System.out.print(marks[i]);
            System.out.print(",");
        }
        System.out.println("\n");*/

       /* double speed[]=new double[7];

        speed [0]=87.5;
        speed [1]=54.6;
        speed [2]=98.7;
        speed [3]=102.54;
        speed [4]=125.34;
        speed [5]=25.98;
        speed [6]=54.71;

        System.out.println(speed.length);
        System.out.println(speed[6]);

        System.out.println("Printing Thru For Loop: ");
        for (int i=0; i< speed.length;i++){
            System.out.print(speed[i]);
            System.out.print(",");
        }
        System.out.println("\n");

        System.out.println("Printing Thru For-Each Loop: ");
        for (double var:speed){
            System.out.print(var);
            System.out.print(",");
        }
        System.out.println("\n");*/


        int flats[][]=new int[2][3];

        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;

        System.out.println(flats.length);

        System.out.println("Printing Thru For Loop");
        for (int i=0;i<flats.length;i++){
            for (int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(",");
            }
            System.out.println("\n");
        }





    }
}
