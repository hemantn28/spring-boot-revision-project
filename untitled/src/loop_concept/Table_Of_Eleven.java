package loop_concept;

public class Table_Of_Eleven {
    //syntax: for(initialization;condition;incemental/decremental){code to be executed}
    public static void main(String[] args) {
        int n=11;
        for(int i=1; i<=10; i++){
            int result=n*i;
            System.out.println("Table Of Eleven "+result);
        }
    }
}
