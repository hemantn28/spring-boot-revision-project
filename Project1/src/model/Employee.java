package model;

public class Employee {

    String name;
    String deptt;
    int salary;

    //parameterized


    public Employee(String name, String deptt, int salary) {
        this.name = name;
        this.deptt = deptt;
        this.salary = salary;
    }

    //getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptt() {
        return deptt;
    }

    public void setDeptt(String deptt) {
        this.deptt = deptt;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
