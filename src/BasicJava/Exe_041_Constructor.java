package BasicJava;

public class Exe_041_Constructor {
    public static void main(String[] args) {
        baby b=new baby();
        b.name="Mukesh";
        System.out.println(b.name);

        car c=new car();
        System.out.println(c.name +" "+c.model+" "+c.year);// print all default value

        c.name="TATA";
        c.model="HARRIER";
        c.year=2024;
        System.out.println(c.name+" "+c.model+" "+c.year);

        car c1=new car("TATA","SAFARI",2025);//paramaetrized constructor
        System.out.println(c1.name+" "+c1.model+" "+c1.year);
    }
}

 class baby{
    String name;

    baby()
    {
        System.out.println("i am constructor");
    }

}

class car
{
    String name;
    String model;
    int year;

    public car() {
        name="Default name";
        model="Default model";
        year=0;
    }

    public car(String name,String model,int year)
    {
        this.name=name;
        this.model=model;
        this.year=year;
    }
}
