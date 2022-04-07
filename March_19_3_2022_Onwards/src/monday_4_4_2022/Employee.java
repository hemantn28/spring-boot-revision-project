package monday_4_4_2022;

public class Employee {
    String name;
    int age;
    String deptt;

    public Employee(String name, int age, String deptt) {
        this.name = name;
        this.age = age;
        this.deptt = deptt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDeptt() {
        return deptt;
    }

    public void setDeptt(String deptt) {
        this.deptt = deptt;
    }
}
