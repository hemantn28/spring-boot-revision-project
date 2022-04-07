package wednesday_6_4_2022;

public class Arrays_Ch_6_PracticeSet_CWH {
    public static void main(String[] args) {
        //Q.1 Create an array of five floats and calculate their sum.

       /* float distance[]={54.6f,65.9f,25.36f,75.14f,12.9f};

        float sum=0;
        //for each loop
        for (float var: distance){
            sum=sum+var;
        }
        System.out.println(sum);*/

        //Q.2 Write a programme to find out whether a given integer is present in an array or not.

        /*int marks[]=new int[7];
        marks[0]=58;
        marks[1]=75;
        marks[2]=69;
        marks[3]=84;
        marks[4]=91;
        marks[5]=47;
        marks[6]=61;

        int num=70;
        boolean isInArray=false;

       for (int var:marks){
           if (num==var){
               isInArray=true;
               break;
           }
       }
       if (isInArray){
           System.out.println("The value is present in the Array");
       }
       else{
           System.out.println("The value is not present in the Array");
       }*/

        //Q.3 Calculate the average marks from an array containing marks of all students in Physics using for each loop.

       /* int marksInPhysics[]={87,97,45,68,71,53,69};

        int sum=0;
        int avg=sum/7;
        for (int var:marksInPhysics){
            sum=sum+var;
            avg=sum/7;
        }
        System.out.println(sum);
        System.out.println(avg);*/

        //Q.4Write a java programme to add two matrices of size 2*3.
      /*  int mat1[][]={{1,2,3},
                      {4,5,6}};
        int mat2[][]={{2,6,8},
                      {3,7,9}};
        int result[][]={{0,0,0},
                        {0,0,0}};

        for (int i=0; i< mat1.length;i++){
            for (int j=0;j< mat1[i].length;j++){
                System.out.format("Setting value for i=%d and j=%d \n",i,j);
                result[i][j]=mat1[i][j] + mat2[i][j];
            }
        }*/
        //Q.5 Write a java programme to reverse an array.
        int arr[]={1,2,3,4,5,6};
        int n=Math.floorDiv(arr.length, 2);
        for (int i=0;i<n;i++){

        }


    }
}

