package object;

public class Elephant {
    //data member
    String breed;
    int weight;

    //todo syntax: access_specifier return_type method_name(parameter){CODE}

    //crush
    public void crush(){
        System.out.println("This is crush method");
    }
    //kill
    public void kill(){
        System.out.println("This is kill method");
    }

    public static void main(String[] args) {
        Elephant heavy=new Elephant();
        heavy.crush();
        heavy.kill();
    }
}
