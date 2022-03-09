package linked;

import java.util.LinkedHashSet;

public class DemoLinkedHashset {

    public void createLinkedHasSet(){
        //syntax: CollectionName <datatype> objname=new CollectionName(){CODE}
        LinkedHashSet<String> myLinkedhHashset=new LinkedHashSet<>();

        myLinkedhHashset.add("Test 1");
        myLinkedhHashset.add("Test 2");
        myLinkedhHashset.add("Test 3");
        myLinkedhHashset.add("Test 4");

        for (String var: myLinkedhHashset){
            System.out.println("Printing myLinkedhHashset "+var);
        }
    }
    public static void main(String[] args) {
        DemoLinkedHashset obj=new DemoLinkedHashset();
        obj.createLinkedHasSet();
    }

}
