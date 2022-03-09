package while_loop;

public class Loop_java {
    public static void main(String[] args) {
        //syntax: while(condition){code to be executed}
        int i=4;
        while (i<7){
            System.out.println(i);
            i++;
        }
        //do{code}
        //while(condition);
        int j=1;
        do{
            System.out.println(j);
            j++;
        }while(j<4);
    }
}
