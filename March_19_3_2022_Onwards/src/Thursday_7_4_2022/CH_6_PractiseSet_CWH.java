package Thursday_7_4_2022;

public class CH_6_PractiseSet_CWH {
    public static void main(String[] args) {
        //Q.1.Create an array of five floats and calculate their sum.
        float prices[]={56.3f,41.9f,82.7f,73.41f,69.38f,};
        float addition=0;
        for (float var:prices){
            addition=addition+var;
        }
        System.out.println("The value of sum is "+addition);

        //Q.2.Write a java programme to find out whether a given integer is present in an array or not.
        int marks[]={57,98,26,37,74,64};
        int num=77;
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
            System.out.println("The value is not present in the array");
        }
        System.out.println("\n");

        //Q.3.Calculate the average marks from an array containing marks of all students in Physics using for each loop.
        double marksInPhysics[]={45,67,63,99,100};
        double sum=0;
        for (double var:marksInPhysics){
            sum=sum+var;
        }
        System.out.println("The value of average marks is "+sum/ marksInPhysics.length);
        System.out.println("\n");

        //Q.4.Create a java programme to add two matrices of 2*3.
        int mat1[][]={{1,2,3},
                      {4,5,6}};

        int mat2[][]={{7,8,9},
                     {10,11,12}};

        int result[][]={{0,0,0},
                       {0,0,0}};
        for (int i=0;i< mat1.length;i++){//row number of times
            for (int j=0;j< mat1[i].length;j++){//column number of times
                System.out.format("Setting value for i=%d and j=%d\n",i,j);
                result[i][j]=mat1[i][j] + mat2[i][j];
            }
        }
        for (int i=0;i< mat1.length;i++){//row number of times
            for (int j=0;j< mat1[i].length;j++){//column number of times
                System.out.print(result[i][j] + " ");
                result[i][j]=mat1[i][j] + mat2[i][j];
            }
            System.out.println("");
        }




        //Q.5.Write a java programme to reverse an array.
        /*int []arr3={1,2,3,4,5,56,84};
        int l=arr3.length;
       int n=Math.floorDiv(arr3.length,2);
        int temp;
        for (int i=0; i<n;i++){
            temp=arr3[i];
            arr3[i]=arr3[l-i-1];
            arr3[l-i-1]=temp;
        }
        for (int var:arr3){
            System.out.print(var +" ");

        }
        System.out.println("\n");*/



        //Q.6.Write a java programme to find the maximum element in a java array.

        int arr1[]={1,21,3,4,631,450,5,34,67};
        int max=0;
        for (int var:arr1){
            if (var>max){
                max=var;
            }
        }
        System.out.print("The maximum value in array is: "+max);
        System.out.println("\n");

        //Q.7.Write a java programme to find the maximum element in a java array.


        int arr2[]={17,21,3,4,631,450,5,34,67};

        int min=631;
        for (int var:arr2){
            if (var<min){
                min=var;
            }
        }
        System.out.print("The minimum value in array is: "+min);
        System.out.println("\n");



        //Q.8.Write a java programme to find out whether an array is sorted or not.

        boolean isSorted=true;
        int arr[]={1,2100,3,455,5,34,67};

        for (int i=0;i<arr.length-1;i++){
            if (arr[i] > arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The Array is Sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }
    }
}
