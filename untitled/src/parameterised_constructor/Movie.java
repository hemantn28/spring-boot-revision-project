package parameterised_constructor;

public class Movie {
    String name;
    String genre;
    int release_year;

    //parameterised constructor

    public Movie(String name, String genre, int release_year) {
        this.name = name;
        this.genre = genre;
        this.release_year = release_year;
    }

    public static void main(String[] args) {
        Movie obj=new Movie("Three Idiots","Drama",2009);
        System.out.println(obj.name);
        System.out.println(obj.genre);
        System.out.println(obj.release_year);

        Movie obj1=new Movie("Shershah","Patriotic",2021);
        System.out.println(obj1.name+obj1.genre+obj1.release_year);

        Movie obj2=new Movie("DDLJ","Love story",1995);
        System.out.println(obj2.name+" "+obj2.genre+" "+obj2.release_year);




    }
}
