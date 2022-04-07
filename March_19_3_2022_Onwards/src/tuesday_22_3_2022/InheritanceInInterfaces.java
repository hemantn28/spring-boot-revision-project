package tuesday_22_3_2022;

interface ParentInterface{
    void meth1();
    void meth2();

}
interface ChildInterface extends ParentInterface{
    void meth3();
    void meth4();

}
class MySampleClass implements ChildInterface{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }

    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}
public class InheritanceInInterfaces {
    public static void main(String[] args) {
        MySampleClass msc=new MySampleClass();
        msc.meth1();
        msc.meth2();
        msc.meth3();
        msc.meth4();

    }
}
