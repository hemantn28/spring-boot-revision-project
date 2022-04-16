package exception_handling;

public class Calculator {
    public void divide(int a, int b){

        int result=0;
        System.out.println("*****before division");
        try{ result=a/b;
        }
        catch (Exception e){
            System.out.println("Exception occured so value of result will be zero");
        }

finally {
            System.out.println("FINALLY BLOCK EXECUTION");
        }
        System.out.println("******After division");
        System.out.print("Division of a and b is: "+result);
        System.out.println("\n");
    }

    public void printArray(int arr[]){
        System.out.println("***before print");
        try{ System.out.println(arr[3]);}
        catch (Exception e){
            System.out.println("Exception occured.....");
        }

        System.out.println("***after print");

    }


    public static void main(String[] args) {
        Calculator calc=new Calculator();
        calc.divide(10,2);
        int arr[]={2,3,9};
        calc.printArray(arr);
    }
}
