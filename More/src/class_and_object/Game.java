package class_and_object;

public class Game {
    String name;
    int runs;

    public Game(String name, int runs) {
        this.name = name;
        this.runs = runs;
    }

    public static void main(String[] args) {
        Game obj=new Game("Azhar",9235);
        System.out.println(obj.name+" "+obj.runs);

        Game obj2=new Game("Anil",2034);
        System.out.println(obj.name+" "+obj2.runs);

        Game obj3=new Game("Virat",8964);
        System.out.println(obj3.name+" "+obj3.runs);
    }
}
