package loop_concept;

public class Table_Of_Fourteen {
    //syntax: for(initialization;condition;incremental/decremental){code to be executed}
    public static void main(String[] args) {
        int n=14;
        for(int i=1; i<=10; i++){
            int result=n*i;
            System.out.println("Table of Fourteen "+result);
        }
    }
}
