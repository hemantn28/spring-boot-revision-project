package loop_concept;

public class Table_Of_Eight {
    //syntax:for(initialization;condition;incremental/decremental){code to be executed}
    public static void main(String[] args) {
        int n=8;
        for(int i=1; i<=11; i++){
            int result=n*i;
            System.out.println("Table Of eight "+result);
        }
    }
}
