package loop;

public class Arrays_states {
    public static void main(String[] args) {
        //syntax for arrays: datatype var_name[]={value1,value2,value3....};
        String state="U.P";
        String state1="Punjab";
        String state2="Bihar";
        String state3="Goa";

        String states[]={"U.P","Punjab","Bihar","Goa"};
        System.out.println(states[2]);
        System.out.println(states[3]);
        System.out.println(states[1]);
        System.out.println(states[0]);

        //for loop
        for(int i=0; i<states.length; i++)
            System.out.println("printing using for loop: "+states[i]);
    }
}
