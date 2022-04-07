package tuesday_22_3_2022;

import lombok.Data;

@Data
class Employee7{
    int id;
    String name;

    public Employee7(String myname,int myId){
        id=45;
        name="Ramesh";
    }
}

public class Constructors {
    public static void main(String[] args) {
        Employee7 e7=new Employee7("Rahul",12);
        System.out.println(e7.getId());
        System.out.println(e7.getName());

    }
}
