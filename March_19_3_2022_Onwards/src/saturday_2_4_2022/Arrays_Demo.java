package saturday_2_4_2022;

public class Arrays_Demo {
    public static void main(String[] args) {

        String names[]= {"Akash", "Ramesh", "Vishal","Vikram","Mohit","Rajat","Prakhar","Shivam"};
        System.out.println(names[5]);

        System.out.println("printing thru for loop; ");
        for (int i=0; i< names.length; i++){
            System.out.println(names[i]);
        }
        System.out.println("printing thru for-each loop");
        for (String var: names){
            System.out.println(var);
        }

        double [] price={987.25,54.12,100.37,549.18,63.10,9.8,784.194,673.19};
        System.out.println(price[6]);

        System.out.println("printing thru for-each loop");
        for (double var: price){
            System.out.println(var);

            System.out.println("printing thru for loop; ");
            for (int i=0; i< price.length; i++){
                System.out.println(price[i]);
            }
            int marks[]={89,71,56,93,47,69,38,25};

            System.out.println("printing thru for-each loop");
            for (int element:marks){
                System.out.println(element);
            }
            System.out.println("printing thru for loop; ");
            for (int i=0; i< marks.length; i++){
                System.out.println(marks[i]);
            }
            int flats[]= new int[9];
            flats[0]=101;
            flats[1]=102;
            flats[2]=103;
            flats[3]=104;
            flats[4]=105;
            flats[5]=106;
            flats[6]=107;
            flats[7]=108;
            flats[8]=109;

            System.out.println("printing thru for loop; ");
            for (int i=0; i< flats.length; i++){
                System.out.println(flats[i]);
            }
            System.out.println("printing thru for-each loop");
            for (int ele: flats){
                System.out.println(ele);
            }
            System.out.println(flats[7]);

            String cities[]= new String[7];

            cities[0]="Shimla";
            cities[1]="Ambala";
            cities[2]="Rohtak";
            cities[3]="Cuttack";
            cities[4]="Pondicherry";
            cities[5]="Panaji";
            cities[6]="Surat";

            System.out.println(cities[3]);

            System.out.println("printing thru for-each loop");

            for (String var1: cities){
                System.out.println(var1);
            }

            System.out.println("printing thru for loop; ");
            for (int i=0; i< cities.length; i++){
                System.out.println(cities[i]);
            }

            String subjects[]={"Maths","English","Science","SST","Hindi","Arts",};

            System.out.println("printing thru for loop; ");
            for (int i=0; i< subjects.length; i++){
                System.out.println(subjects[i]);
            }

            System.out.println("printing thru for-each loop");

            for (String elements: subjects){
                System.out.println(elements);
            }

            int flat[][]= new int[2][3];

            flat[0][0]=101;
            flat[0][1]=102;
            flat[0][2]=103;
            flat[1][0]=201;
            flat[1][1]=202;
            flat[1][2]=203;

            System.out.println("printing a 2-d array using for loop");
            for (int i=0; i< flat.length; i++){
                for (int j=0;j<flat[i].length;j++){
                    System.out.print(flat[i][j]);
                    System.out.print(" ");
                }
                System.out.println(" ");
            }

            int almirah[][]=new int[2][3];

            almirah[0][0]=11;
            almirah[0][1]=12;
            almirah[0][2]=13;
            almirah[1][0]=21;
            almirah[1][1]=22;
            almirah[1][2]=23;

            System.out.println("printing a 2-d array using for loop");
            for (int i=0; i< almirah.length; i++){
                for (int j=0;j<almirah[i].length; j++){
                    System.out.print(almirah[i][j]);
                    System.out.print(" ");
                }
                System.out.println(" ");
            }

            int books[][]= new int[2][3];

            books[0][0]=01;
            books[0][1]=02;
            books[0][2]=03;
            books[1][0]=11;
            books[1][1]=12;
            books[1][2]=13;

            for (int i=0; i< books.length; i++){
                for (int j=0; j<books[i].length; j++){
                    System.out.print(books[i][j]);
                    System.out.print(" ");
                }
                System.out.println(" ");
            }

            String places[]={"raja ki mandi", "Harsaon","tala nagari","Bihari vilas","jagatpura"};

            System.out.println("printing thru for-each loop");
            for (String var1:places){
                System.out.println(var1);
            }
            System.out.println("printing thru for loop; ");
            for (int i=0; i< places.length; i++){
                System.out.println(places[i]);
            }

















        }
    }
}
