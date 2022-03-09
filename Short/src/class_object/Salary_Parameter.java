package class_object;

public class Salary_Parameter {

    String name;
    double salary;
    String company;
    String city;

    public Salary_Parameter(String name, double salary, String company, String city) {
        this.name = name;
        this.salary = salary;
        this.company = company;
        this.city = city;
    }

    public static void main(String[] args) {

        //creating object: Classname object_name=new classname(value1,value2,value3...);

        Salary_Parameter std=new Salary_Parameter("Rohit",45032.5,"tcs","hyderabad");
        System.out.println(std.name+" "+std.salary+" "+std.company+" "+std.city);

        Salary_Parameter std2=new Salary_Parameter("Navdeep",75206.5,"infosys","mumbai");
        System.out.println(std2.name+" "+std2.salary+" "+std2.company+" "+std2.city);

        Salary_Parameter std3=new Salary_Parameter("Kartik",63254.5,"IBM","Bangalore");
        System.out.println(std3.name+" "+std3.salary+" "+std3.company+" "+std3.city);

        Salary_Parameter std4=new Salary_Parameter("Mohan",56321.5,"Wipro","Pune");
        System.out.println(std4.name+" "+std4.salary+" "+std4.company+" "+std4.city);

        Salary_Parameter std5=new Salary_Parameter("Sachin",59326.5,"NTT","Noida");
        System.out.println(std5.name+" "+std5.salary+" "+std5.company+" "+std5.city);




    }
}
