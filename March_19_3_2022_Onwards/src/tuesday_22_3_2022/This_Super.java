package tuesday_22_3_2022;

import lombok.Data;

@Data
class Annie{
    int a;

    Annie(int a){
        this.a=a;
    }

    public int one(){
        return 1;
    }
}
class Lambda extends Annie{

    Lambda(int c){
        super(c);
        System.out.println("i m a constructor");
    }
}
public class This_Super {
    public static void main(String[] args) {
        Annie an=new Annie(65);
        Lambda lmd=new Lambda(5);
        System.out.println(an.getA());

    }
}
