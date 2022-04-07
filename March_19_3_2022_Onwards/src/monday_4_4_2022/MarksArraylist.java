package monday_4_4_2022;
import java.util.*;
public class MarksArraylist {
    public static void main(String[] args) {
        //syntax: Collection_Name<datatype> Obj_name=new Collection_Name<>();
        ArrayList<Integer> marks=new ArrayList<>();

        marks.add(85);
        marks.add(54);
        marks.add(79);
        marks.add(49);
        marks.add(90);
        marks.add(63);
        marks.add(2,74);
        marks.add(1,49);
        marks.remove(3);
        marks.set(5,95);
        marks.remove(4);
        System.out.println(marks.get(2));
        System.out.println(marks.contains(89));
        System.out.println(marks.indexOf(49));
        System.out.println(marks.lastIndexOf(49));

        System.out.println(marks);

        for (int i=0; i< marks.size();i++){
            System.out.print(marks.get(i));
            System.out.print(",");
        }




    }
}
