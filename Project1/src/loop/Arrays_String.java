package loop;

public class Arrays_String {
    public static void main(String[] args) {
        //syntax for arrays: datatype var_name[]={value1,value2,value3....};

        String subject="Maths";
        String subject1="Hindi";
        String subject2="Bio";
        String subject3="English";

        String subjects[]={"Maths","Hindi","Bio","English"};
        System.out.println(subjects[3]);
        System.out.println(subjects[1]);
        System.out.println(subjects[0]);
        System.out.println(subjects[2]);

        //for loop
        for(int i=0; i< subjects.length; i++){
            System.out.println("printing using for loop: "+subjects[i]);
        }
    }
}
