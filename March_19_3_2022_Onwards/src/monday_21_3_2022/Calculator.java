package monday_21_3_2022;

class Boys{
    String name;
    String address;
    int age;

    public Boys(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
}

class Person{
    String name;
    String address;
    int age;

    public void walk(){
        System.out.println("A person can walk");
    }
    public void eat(){
        System.out.println("A person can eat");
    }
    public void talk(){
        System.out.println("A person can talk");
    }
    public void getName(){
        System.out.println(this.name);
    }
    public void getAddress(){
        System.out.println(this.address);
    }
    public void getAge(){
        System.out.println(this.age);
    }
}
public class Calculator {

    public void addition(){
        int a=5;
        int b=4;
        int c=a+b;
        System.out.println("Sum is "+c);
    }
    public void subtraction(){
        int a=8;
        int b=4;
        int c=a-b;
        System.out.println("subtraction is "+c);
    }
    public void multiply(){
        int a=8;
        int b=9;
        int c=a*b;
        System.out.println("multiply is "+c);
    }
    public void division(){
        int a=98;
        int b=2;
        int c=a/b;
        System.out.println("division is "+c);
    }
    public void division1(){
        double a=9;
        double b=4;
        double c=a/b;
        System.out.println("divide is "+c);

    }
    public void square(){
        int a=5;
        int b=a*a;
        System.out.println("square is "+b);
    }
    public void addition1(int a, int b){
        int result=a+b;
        System.out.println("addition is "+result);
    }
    public void subtraction1(int a, int b){
        int result=a-b;
        System.out.println("subtraction is "+result);
    }
    public void multiply1(int a, int b){
        int result=a*b;
        System.out.println("multiply is "+result);
    }
    public void divide1(int a, int b){
        int result=a/b;
        System.out.println("division is  "+result);
    }
    public void makeSquare(int a){
        int square=a*a;
        System.out.println("square is "+square);
    }
    public void makeCube(int a){
        int cube=a*a*a;
        System.out.println("cube is  "+cube);
    }
    public int add(int a, int b){
        int add=a+b;
        return add;
    }
    public double divide(double a, double b){
        double result=a/b;
        return result;
    }
    public int multiply(int a, int b){
        int result1=a*b;
        return result1;
    }
    public int minus(int a, int b){
        int minus=a-b;
        return minus;
    }
    public String message(String name){

        return name;
    }
    public int getAge(int age){

        return age;
    }
    public double getPrice(double price){
        return price;
    }
    public int makeSquare1(int num){
        int square1=num*num;
        return square1;
    }
    public void meet(String name){
        System.out.println("Your name is "+name);
    }
    public void checkInfo(String name, int age){
        System.out.println("Your name is "+name);
        System.out.println("Your age is "+age);
    }
    public void checkEligibilty(int age){
        if (age>18){
            System.out.println("eligible for voting");
        }
        else{
            System.out.println("not eligible for voting");
        }
    }

    public static void main(String[] args) {
        Calculator cl=new Calculator();
        cl.addition();
        cl.subtraction();
        cl.multiply();
        cl.division();
        cl.division1();
        cl.square();
        cl.addition1(5,6);
        cl.subtraction1(54,21);
        cl.multiply1(5,4);
        cl.divide1(69,3);
        cl.makeSquare(7);
        cl.makeCube(5);
        int add=cl.add(5,2);
        System.out.println("add is "+add);
        double result=cl.divide(85.5,5.5);
        System.out.println("divide is  "+result);
        int result1=cl.multiply(7,4);
        System.out.println("multiply is  "+result1);
        int minus=cl.minus(85,23);
        System.out.println("minus is "+minus);
        String name=cl.message("Vishal");
        System.out.println("My name is "+name);
        int age=cl.getAge(22);
        System.out.println("My age is "+age);
        double price=cl.getPrice(85.6);
        System.out.println("Price is "+price);
        int square1=cl.makeSquare1(6);
        System.out.println("Square is "+square1);
        cl.meet("Chintu");
        cl.checkInfo("Arpit",24);
        cl.checkEligibilty(19);

        Person ps=new Person();
        ps.walk();
        ps.talk();
        ps.eat();
        ps.name="Akshar";
        ps.address="Srinagar";
        ps.age=23;
        ps.getName();
        ps.getAddress();
        ps.getAge();

        Person ps2=new Person();
        ps2.name="Rashid";
        ps2.address="Aligarh";
        ps2.age=25;
        ps2.getName();
        ps2.getAddress();
        ps2.getAge();

        Person ps3=new Person();
        ps3.name="Sameer";
        ps3.address="Bikaner";
        ps3.age=26;
        ps3.getName();
        ps3.getAddress();
        ps3.getAge();

        Boys bs=new Boys("Ram","Mathura",27);
        System.out.println(bs.name+" "+bs.address+" "+bs.age);

        Boys bs2=new Boys("Krishna","Ayodhya", 28);
        System.out.println(bs2.name+" "+bs2.address+" "+bs2.age);

        Boys bs3=new Boys("Shikhar","Meerut",29);


    }
}
