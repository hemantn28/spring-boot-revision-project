package model;

public class Doctor {
    String name;
    int fee;
    String location;

    //parameterized constructor

    public Doctor(String name, int fee, String location) {
        this.name = name;
        this.fee = fee;
        this.location = location;
    }
    //getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
