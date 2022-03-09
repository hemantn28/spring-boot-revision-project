package collections;

import java.util.ArrayList;

public class ArrayListCity {
    public void createList(){
        //syntax: collectionname <datatype> objname=new collectionname();

        ArrayList<City> cityArrayList=new ArrayList<>();

        //create object of city class

        City city1=new City("Agra","U.P",1765324);
        City city2=new City("Jaipur","Rajasthan",2403698);
        City city3=new City("Chennai","Rajasthan",3602145);

        cityArrayList.add(city1);
        cityArrayList.add(city2);
        cityArrayList.add(city3);

        for(City var: cityArrayList){
            System.out.println("printing city ArrayList "+var.getName());
            System.out.println("printing city ArrayList "+var.getState());
            System.out.println("printing city ArrayList "+var.getPopulation());

        }
    }

    public static void main(String[] args) {
        ArrayListCity obj=new ArrayListCity();
        obj.createList();
    }
}
