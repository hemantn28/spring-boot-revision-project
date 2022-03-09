package loop;

public class Arraylist_Integer_Value {
    public static void main(String[] args) {
        //syntax for arrays: datatype var_name[]={value1,value2,value3.....};

        int mark=85;
        int mark1=79;
        int mark2=69;
        int mark3=54;

        int marks[]={85,79,69,54,45,61,69};
        System.out.println(marks[4]);

        //for loop
        for(int i=0; i< marks.length; i++){
            System.out.println("printing marks using for loop: "+marks[i]);
        }
    }
}
