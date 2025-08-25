package BasicJava;

public class Exe_047_SuperThisKey {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.disply();
        c1.message();
    }
}

class vehicle{

    int MaxSpeed=100;

    public vehicle() {
        System.out.println("i am default constructor");
    }

    public vehicle(int a)
    {
        System.out.println("i am parameter const");
    }

    void disply()
    {
        System.out.println("Parent display");
    }
}

class Car extends vehicle{

    int MaxSpeed=110;

    public Car() {
        super(100);
    }

    public Car(int a)
    {
        System.out.println("i am defult const for car");
    }
    void message()
     {
    System.out.println("Car message");
     }
    void disply()
    {
        System.out.println(super.MaxSpeed);
        System.out.println(this.MaxSpeed);
        super.disply();
        this.message();
    }
}