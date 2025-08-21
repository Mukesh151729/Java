package BasicJava;

public class Exe_042_SingleInheritance {
    public static void main(String[] args) {

        son mukesh=new son();
        mukesh.BHK3();
        System.out.println(mukesh.gold);
        mukesh.BHK2();
    }
}

class father{
    int gold=1000;

    void BHK2()
    {
        System.out.println("Father 2BHK");
    }
}

class son extends father
{
    void BHK3()
    {
        System.out.println("Son 3BHK");
    }
}
