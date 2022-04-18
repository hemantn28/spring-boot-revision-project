package this_super_keyword;

class One{
    int a;

    public int getA() {
        return a;
    }

    One(int a){
       this.a=a;
    }
    public int returnone(){
        return 1;
    }
}
class Two extends One{
    Two(int c){
        super(c);
        System.out.println("I am a constructor");
    }
}
public class This_Super {
    public static void main(String[] args) {
        One one=new One(65);
        Two two=new Two(5);

        System.out.println(one.getA());
    }
}
