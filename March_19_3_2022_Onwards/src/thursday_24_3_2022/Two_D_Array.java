package thursday_24_3_2022;

public class Two_D_Array {
    public static void main(String[] args) {
        //Allocate marks of 5 students
      /*  int marks[]= new int[5];

        marks[0]=100;
        marks[1]=83;
        marks[2]=45;
        marks[3]=76;
        marks[4]=58;

        System.out.println(marks[2]);

        int marks1[]={25,94,71,69,49};

        System.out.println(marks1[2]);*/

        String names[]= new String[6];

        names[0]="Ravi";
        names[1]="Kamesh";
        names[2]="Ramesh";
        names[3]="Hiten";
        names[4]="Rohit";
        names[5]="Sohan";


        System.out.println("printing thru for loop");
        for (int i=0; i< names.length; i++){
            System.out.println(names[i]);
        }
        System.out.println("printing thru advance-for loop");
        for (String var:names){
            System.out.println(var);
        }

        String name[]={"Lovish","Rana","Madhur","Bunty","Jitendar","Prashant"};
       /* System.out.println(name[3]);
        System.out.println(name.length);*/

        System.out.println("printing thru for loop");
        for (int i=0; i<name.length; i++){
            System.out.println(name[i]);
        }

        System.out.println("printing thru advance-for loop");
        for (String element:name){
            System.out.println(element);
        }

        //print marks of 6 student in an array.








    }
}
