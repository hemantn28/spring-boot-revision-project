package while_loop;

public class Loop_While_Std {
    public static void main(String[] args) {
        //syntax: while(condition){code to be executed}
        int i=1;
        while(i<6){
            System.out.println(i);
            i++;
        }
        //do{code}
        //while(condition);
        int j=4;
        do{
            System.out.println(j);
            j++;
        }while (j<50);
    }
}
