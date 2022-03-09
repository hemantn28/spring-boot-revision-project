package object;

public class Wild_Animals {
    //data member
    String breed;
    int weight;

    //todo syntax: access_specifier return_type method_name(parameter){CODE}
    //hunt
    public void hunt(){
        System.out.println("This is hunt method");
    }
    //scare
    public void scare(){
        System.out.println("This is scare method");
    }

    public static void main(String[] args) {
        Wild_Animals cat=new Wild_Animals();
        //how to call or execute method?
        //objectname.methodname();
        cat.hunt();
        cat.scare();
    }

}
