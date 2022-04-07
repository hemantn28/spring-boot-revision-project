package getterandsetter_19_3_2022;

public class Main {
    public static void main(String[] args) {
        Bicycle bc=new Bicycle();
        bc.setName("Atlas");
        System.out.println(bc.getName());
        bc.setPrice(5000);
        System.out.println(bc.getPrice());
        bc.ride();

        State st=new State();
        st.setName("Punjab");
        System.out.println(st.getName());
        st.setAge(40);
        System.out.println(st.getAge());
        st.live();

        Circles ccs=new Circles();
        ccs.setRadius(4);
        System.out.println(ccs.getRadius());
        ccs.area(4);

        double circumference=ccs.circumference();
        System.out.println("circumference is "+circumference);

    }
}
