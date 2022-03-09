package model;

import java.util.Objects;

public class Employee {

    String name;
    int salary;
    String deptt;

    public Employee(String name, int salary, String deptt) {
        this.name = name;
        this.salary = salary;
        this.deptt = deptt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDeptt() {
        return deptt;
    }

    public void setDeptt(String deptt) {
        this.deptt = deptt;
    }
}
