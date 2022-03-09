package set;

import java.util.HashSet;

public class DemoHashSet {
    public void createHashSet(){
        //SYNTAX: CollectionName<Datatype> ObjName=New CollectionName();
        HashSet<Integer> obj= new HashSet<>();

        obj.add(8);
        obj.add(8);
        obj.add(5);
        obj.add(5);
        obj.add(5);
        obj.add(4);
        obj.add(4);

        for(Integer var: obj){
            System.out.println("Printing HashSet: "+var);
        }
    }
    public void createStringSet(){
        HashSet<String> obj1=new HashSet<>();
        obj1.add("Ram");
        obj1.add("Ram");
        obj1.add("Ram");
        obj1.add("Shyam");
        obj1.add("Shyam");
        obj1.add("Krishna");
        obj1.add("Krishna");
        obj1.add("Lakhan");
        for(String var: obj1){
            System.out.println("printing String HashSet: "+var);
        }
    }
    public static void main(String[] args) {
        DemoHashSet obj=new DemoHashSet();
        obj.createHashSet();
        obj.createStringSet();

    }
}
