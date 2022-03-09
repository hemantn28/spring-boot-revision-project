package object;

public class Neha {
    //data member
    int age;
    String school;

    //todo syntax: access_specifier return_type method_name(parameter){CODE}

    //capabilities

    //read
    public void read(){
        System.out.println("This is read method");
    }
    //watch
    public void watch(){
        System.out.println("This is watch method");
    }

    public static void main(String[] args) {
        Neha girl=new Neha();
        girl.read();
        girl.watch();
    }
}
