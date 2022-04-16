package Thursday_7_4_2022;

public class Arrays {
    public static void main(String[] args) {
        //Syntax: Datatype Variable_Name[]={value1,value2,value3....};
        //Syntax: Datatype Variable[]= new Datatype[];
        //Variable[]= value;

        /*String names[]={"Rahul","Vikrant","Shobhit","Anil","Sudeep","Pradeep","Jitendar","Sonu"};

        System.out.println("Printing thru Advance For Loop");
        for (String var: names){
            System.out.print(var);
            System.out.print(",");
        }
        System.out.println("\n");

        System.out.println("Printing Thru for loop");
        for (int i=0;i< names.length;i++){
            System.out.print(names[i]);
            System.out.print(",");
        }
        System.out.println("\n");

        System.out.println(names[3]);
        System.out.println(names.length);*/

        int marks[]= new int[6];

        marks[0]=56;
        marks[1]=78;
        marks[2]=91;
        marks[3]=65;
        marks[4]=47;
        marks[5]=38;
        marks[5]=87;

        System.out.println(marks[4]);
        System.out.println(marks.length);

        for (int var:marks){
            System.out.print(var);
            System.out.print(",");
        }
        System.out.println("\n");



    }
}
