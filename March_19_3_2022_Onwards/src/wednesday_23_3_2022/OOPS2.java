package wednesday_23_3_2022;

/*class Arithmetic{

    public int add(int a, int b){
        int sum=a+b;
        return sum;
    }
}
class Adder extends Arithmetic{

}*/

import java.util.Scanner;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;

    }
}
class MyBook extends Book{
     void setTitle(String s){
         title=s;
     }
}

public class OOPS2 {
    public static void main(String[] args) {
        /*Adder a=new Adder();
        int sum=a.add(10,32);
        System.out.println(sum);
        Arithmetic atm=new Arithmetic();
        System.out.println("My superclass is : "+a.getClass().getName());
        System.out.println(a.add(10,32) + " "+a.add(10,3) +" "+a.add(10,10) +  "\n");*/




        MyBook new_novel=new MyBook();
        new_novel.setTitle("A tale of two cities");
        System.out.println(new_novel.getTitle());





    }

}
