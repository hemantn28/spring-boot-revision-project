package arrays;

public class Exercise {
    public static void main(String[] args) {
       /*
        String[]students={"vikas","Rahul","Vikram","Ramesh","Ram"};
        System.out.println(students.length);
        System.out.println(students[2]);
        double[]price={96.2,86.6,78.8,78.1,12.4};
        System.out.println(price.length);
        System.out.println(price[0]);*/

        int[]marks={80,76,69,60,71};
        //System.out.println(marks.length);
        //displaying the Array(Naive way)
        System.out.println("printing using naive method");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        //displaying the Array(for loop way)
        System.out.println("printing using for loop method");
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        System.out.println("Displaying in reverse order");
        for(int i=marks.length-1;i>=0;i--){
            System.out.println((marks[i]));
        }

        System.out.println("displaying the array for each loop");
        for(int element:marks){
            System.out.println(element);

        }

    }
}
