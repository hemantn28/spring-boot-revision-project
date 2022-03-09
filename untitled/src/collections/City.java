package collections;

public class City {
    String name;
    String state;
    int population;

    //parameterized


    public City(String name, String state, int population) {
        this.name = name;
        this.state = state;
        this.population = population;
    }

    //getter & setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
