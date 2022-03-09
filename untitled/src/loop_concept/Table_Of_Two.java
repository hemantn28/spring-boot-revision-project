package loop_concept;

public class Table_Of_Two {

    //syntax: for(initialization;condition;incremental/decremental){code to be executed}

    public static void main(String[] args) {
        int n=2;
        for(int i=1; i<=10; i++){
            int result=n*i;
            System.out.println("Table of two: "+result);
        }
    }
}
