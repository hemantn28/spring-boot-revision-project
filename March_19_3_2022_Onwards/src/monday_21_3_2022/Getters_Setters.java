package monday_21_3_2022;


import lombok.Data;

@Data

class Girls{
    private String name;
    private String address;
    private int age;


    public void study(){
        System.out.println("Girls can read");
    }
    public void work(){
        System.out.println("Girls can work");
    }
}


public class Getters_Setters {
}
