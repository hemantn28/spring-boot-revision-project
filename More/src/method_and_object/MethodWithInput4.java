package method_and_object;

public class MethodWithInput4 {
    public void checkeligibility(int age){
        if (age>18){
            System.out.println("eligible for voting");
        }
        else{
            System.out.println("not eligible");
        }
    }
    public void test(String name, int marks){
        System.out.println("name is "+name);
        System.out.println("marks are "+marks);
    }
    public void intro(String name){
        String var=name;
        System.out.println("This is intro "+var);
    }

    public static void main(String[] args) {
        MethodWithInput4 obj=new MethodWithInput4();
        obj.checkeligibility(21);
        obj.test("Gagan",98);
        obj.intro("Sohan");


    }
}
