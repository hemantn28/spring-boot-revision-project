package monday_21_3_2022;

public class MyMainEmployee {
    int id;
    String name;

    public MyMainEmployee(){
        id=45;
        name="Vikas";
    }

    public MyMainEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        MyMainEmployee mme=new MyMainEmployee(55,"Rahul");

    }
}
