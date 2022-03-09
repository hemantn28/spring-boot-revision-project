package linked;

import java.util.LinkedHashSet;

public class DemoLinked {

    public void createLinkedHashSet(){
        //CollectionName<String> Objname=new CollectionName(){CODE}

        LinkedHashSet<String> stringLinkedHashSet=new LinkedHashSet<>();

        stringLinkedHashSet.add("Raj");
        stringLinkedHashSet.add("Pritam");
        stringLinkedHashSet.add("Kapisha");
        stringLinkedHashSet.add("Arvind");
        stringLinkedHashSet.add("Deepak");
        stringLinkedHashSet.add("Saurabh");
        stringLinkedHashSet.add("Nitin");

        for(String var: stringLinkedHashSet){
            System.out.println("Printing stringLinkedHashSet "+var);
        }
    }

    public static void main(String[] args) {
        DemoLinked obj=new DemoLinked();
        obj.createLinkedHashSet();
    }
}
