package methodswithinput;

public class School_Input {
    //syntax : access_simplifier return_type method_name(input parameter){CODE}
    public void magic(String name){

        String var=name+" Welcome to Cyber city";

        System.out.println(" this is magic method "+var);
    }
    public void checkeligibility(int age){
        if(age>18){
            System.out.println("eligible for voting");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
    public void city(String name, String city_name){
        System.out.println("Name is "+name);
        System.out.println("Cityname is "+city_name );
    }
    public void car(String car_name,int max_speed){
        System.out.println("car_name is "+car_name);
        System.out.println("max_speed is "+max_speed);
    }


    public static void main(String[] args) {
        School_Input obj=new School_Input();
        obj.magic("Parag");
        obj.checkeligibility(19);
        obj.city("Saurabh","Agra");
        obj.car("Fortuner",180);
    }
}
