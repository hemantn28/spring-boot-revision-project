package map;

import model.Player;

import java.util.HashMap;

public class PlayerHashMap {
    public void createMap(){
        //syntax:CollectionName<datatype key, Datatype_value> obj_name=new CollectionName(){CODE}

        HashMap<Integer, Player> playerHashMap=new HashMap<>();

        //create object of player model class
        Player player1=new Player("Sachin Tendulkar",14000,"India");
        Player player2=new Player("Ricky Ponting",11000,"Austarlia");
        Player player3=new Player("Jonty Rhodes",9000,"South Africa");

        //add
        playerHashMap.put(14000,player1);
        playerHashMap.put(11000,player2);
        playerHashMap.put(9000,player3);

        for (Integer var: playerHashMap.keySet()){
            System.out.println("Printing Player Map: "+playerHashMap.get(var).getPlayername());
            System.out.println("Printing Player Map: "+playerHashMap.get(var).getRuns());
            System.out.println("Printing Player Map: "+playerHashMap.get(var).getNation());
        }
    }

    public static void main(String[] args) {
        PlayerHashMap obj=new PlayerHashMap();
        obj.createMap();
    }
}
