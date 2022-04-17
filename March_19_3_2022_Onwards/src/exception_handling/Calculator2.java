package exception_handling;

public class Calculator2 {

    public void divide(int a, int b){
        int result=0;
        System.out.println("******before division");
        try {
            result=a/b;
        }
        catch (Exception e){
            System.out.println("Exception occurred so value of result will be zero");
        }
        finally {
            System.out.println("FINALLY BLOCK EXECUTION");
        }
        System.out.println("******after division");
        System.out.println("Division is: "+result);
    }
    public void printArray(int arr[]){
        System.out.println("*******before print");
        try {
            System.out.println(arr[3]);
        }
        catch (Exception e){
            System.out.println("Exception occurred.....");
        }

        System.out.println("******after print");

    }

    public static void main(String[] args) {
        Calculator2 calc=new Calculator2();
        calc.divide(45,0);

        int arr[]={2,3,9};
        calc.printArray(arr);
    }


}
