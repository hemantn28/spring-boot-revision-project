package Thursday_7_4_2022;

public class Arrays2 {
    public static void main(String[] args) {
        //Syntax: Datatype Variable_Name[]={value1,value2,value3....};
    /*Syntax: Datatype Variable_Name[]= new Datatype[];
              Variable_Name[]= value; */

        int houses[][] = new int[2][3];

        houses[0][0]=101;
        houses[0][1]=102;
        houses[0][2]=103;
        houses[1][0]=201;
        houses[1][1]=202;
        houses[1][2]=203;


        System.out.println(houses.length);

        System.out.println("Printing Thru For Loop");
        for (int i=0;i< houses.length;i++){
            for (int j=0;j< houses[i].length;j++){
                System.out.print(houses[i][j]);
                System.out.print(",");
            }
            System.out.println("\n");
        }



    }

}
