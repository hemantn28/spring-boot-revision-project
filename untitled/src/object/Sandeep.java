package object;

public class Sandeep {
    //data member
    int age;
    int weight;

    //todo syntax: access_specifier return_type method_name(parameter){CODE}

    //capabilities
    //study
    public void study(){
        System.out.println("This is study method");
    }
    //talk
    public void talk(){
        System.out.println("This is talk method");
    }

    public static void main(String[] args) {
        Sandeep boy=new Sandeep();
        boy.study();
        boy.talk();
    }
}
