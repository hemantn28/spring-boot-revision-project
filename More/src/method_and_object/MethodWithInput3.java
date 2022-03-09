package method_and_object;

public class MethodWithInput3 {
    public void check(int speed){
        if (speed>80){
            System.out.println("you are driving fast");
        }
        else{
            System.out.println("you are driving slow");
        }
        }
        public void intro(String name){

        String var=name+ " I am ur buddy ";
            System.out.println("This is intro method "+var);
        }
        public void test(String name,String colour){
            System.out.println("name is "+name);
            System.out.println("colour is "+colour);
        }

    public static void main(String[] args) {
        MethodWithInput3 obj=new MethodWithInput3();
        obj.check(70);
        obj.intro("Narendra");
        obj.test("Amit","black");
    }
}
