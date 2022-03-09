package conditionalstatement;

public class If_Else {
    public static void main(String[] args) {
        int age=17;
        if(age>18){
            System.out.println("eligible for voting");
        }
        else{
            System.out.println("not eligible");
        }

        int marks=53;
        if(marks>60){
            System.out.println("first division");
        }
        else{
            System.out.println("not first division");
        }
        String cityname="Churu";
        if(cityname=="Pune"){
            System.out.println("you are in pune");
        }
        else{
            System.out.println("you are not in pune");
        }
        double price=75.32;
        if(price>70){
            System.out.println("product is costly");
        }
        else {
            System.out.println("product is not costly");
        }
        String name="Ramesh";
        if(name=="Rahul"){
            System.out.println("you are rahul");
        }
        else{
            System.out.println("you are not rahul");
        }
    }
}
