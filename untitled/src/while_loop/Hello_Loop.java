package while_loop;

public class Hello_Loop {
    public static void main(String[] args) {
        //syntax: while(condition){code to be executed}
        int i=0;
        while(i<10){
            System.out.println("Hello "+i);
            i++;
        }
        //do {code}
        // while (condition);
        int j=0;
        do{
            System.out.println(j);
            j++;
        }while(j<5);
    }
}
