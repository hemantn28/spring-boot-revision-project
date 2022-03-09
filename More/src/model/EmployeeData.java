package model;

public class EmployeeData {
    String name;
    int emp_id;
    String deptt;

    //parameterized constructor

    public EmployeeData(String name, int emp_id, String deptt) {
        this.name = name;
        this.emp_id = emp_id;
        this.deptt = deptt;
    }
    //getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getDeptt() {
        return deptt;
    }

    public void setDeptt(String deptt) {
        this.deptt = deptt;
    }
}
