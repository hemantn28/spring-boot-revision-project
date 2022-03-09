package object;

public class Electricity {
    //data member
    String current;
    String invisible;

    //todo syntax: access_specifier return_type method_name(parameter){CODE}

    //capabilities
    //iilluminate
    public void iilluminate(){
        System.out.println("This is iilluminate method");
    }
    //run_machines
    public void run_machines(){
        System.out.println("This is run_machines method");
    }

    public static void main(String[] args) {
        Electricity light=new Electricity();
        light.iilluminate();
        light.run_machines();
    }
}
