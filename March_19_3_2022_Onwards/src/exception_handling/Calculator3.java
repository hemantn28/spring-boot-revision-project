package exception_handling;

public class Calculator3 {
    int result=0;
    public void divide(int a, int b){
        System.out.println("*********before division");
        try {
            result=a/b;
        }
        catch (Exception e){
            System.out.println("Exception occurred and catch so value of result will be zero.");
        }
        finally {
            System.out.println("finally block execution");
        }
        System.out.println("**********after division");
        System.out.println("division is: "+result);

    }
    public void printArray(int arr[]){
        System.out.println("*****before print");
        try {
            System.out.println("Printing 4th element of Array "+arr[3]);
        }
        catch (Exception e){
            System.out.println("Exception occurred.....");
        }
        System.out.println("******after print");
    }

    public static void main(String[] args) {
        Calculator3 calc=new Calculator3();
        calc.divide(45,9 );

        int arr[]={2,3,9};
        calc.printArray(arr);
    }

}
