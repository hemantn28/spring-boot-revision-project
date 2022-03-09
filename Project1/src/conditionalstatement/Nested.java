package conditionalstatement;

public class Nested {
    public static void main(String[] args) {

        //AND OPERATOR

        int age=19;
        String city="Agra";
        if(age>18 && city=="Agra"){
            System.out.println("eligible for voting in Agra");
        }
        else{
            System.out.println("not eligible");
        }
        //OR OPERATOR
        double salary=68635.36;
        String cityname="Agra";
        if(salary>60000 || cityname=="hyderabad"){
            System.out.println("You are in IT company");
        }
        else{
            System.out.println("You are not in IT company");
        }
        //NOT OPERATOR
        int pay=68635;
        String placename="Agra";
        if(!(pay>60000 || placename=="Agra")){
            System.out.println("You are in IT company");
        }
        else{
            System.out.println("You are not in IT company");
        }

        int age2=19;
        String cityplace="Agra";
        if(!(age2>18) && cityplace=="Agra"){
            System.out.println("eligible for voting in Agra");
        }
        else{
            System.out.println("not eligible");
        }

    }
}
