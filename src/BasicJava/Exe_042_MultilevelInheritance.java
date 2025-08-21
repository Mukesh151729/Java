package BasicJava;

public class Exe_042_MultilevelInheritance {
    public static void main(String[] args) {

        Son1 s=new Son1();
        s.home();
        System.out.println(s.gold);

        Father1 f =new Father1();
        f.home();
        System.out.println(f.gold);

       Grandfather g =new Grandfather();
       g.home();
        System.out.println(g.gold);

        Grandfather g1=new Father1();
        System.out.println(g1.gold);
        g1.home();
    }
}

class Grandfather
{
    int gold =100;

    void home()
    {
        System.out.println("Granfather 2 BHK");
    }
}

class Father1 extends Grandfather
{
    int gold=1000;

    void home()
    {
        System.out.println("Father 3 BHK");
    }
}

class Son1 extends Father1
{
    void home()
    {
        System.out.println("Son villa");
    }
}
