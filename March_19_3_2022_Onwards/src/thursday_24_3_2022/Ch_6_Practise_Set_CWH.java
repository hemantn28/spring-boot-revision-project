package thursday_24_3_2022;

public class Ch_6_Practise_Set_CWH {
    public static void main(String[] args) {
        //Q.1 Create an array of 5 floats and calculate their sum.

        float price[] = new float[5];

        price[0]=876.50f;
        price[1]=945.51f;
        price[2]=347.01f;
        price[3]=643.91f;
        price[4]=417.24f;

        System.out.println(price[3]);
        System.out.println(price.length);
        float sum=0;
        for (float var:price){
            sum=sum+var;
        }
        System.out.println("the value of sum is "+sum);

        //Q.2 Write a programme to find out whether a given integer is present in an array or not.
        int marks[]= new int[6];

        marks[0]=56;
        marks[1]=87;
        marks[2]=71;
        marks[3]=69;
        marks[4]=89;
        marks[5]=97;

        int num =19;
        boolean isInArray=false;
        for (int var:marks){
            if(num==var){
                isInArray=true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in the array");
        }
        else{
            System.out.println("The value is not present in the array");
        }

        //Q.3 Calculate average marks from an array containing marks of all students in Physics using for each loop.
        int marksPhysics []= new int[6];

        marksPhysics[0]=54;
        marksPhysics[1]=84;
        marksPhysics[2]=96;
        marksPhysics[3]=68;
        marksPhysics[4]=71;
        marksPhysics[5]=45;

        int n=6;
        int add=0;
        int avg=add/n;
        for (int var:marksPhysics){
            add=add+var;
            avg=add/n;
        }
        System.out.println("avg is "+avg);

        //Q.4 Create

    }
}
