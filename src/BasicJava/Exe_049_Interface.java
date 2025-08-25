package BasicJava;

public class Exe_049_Interface {
    public static void main(String[] args) {

        test1 test1=new test1();
        test1.interfaceCollection();
    }
}

interface I{
    void icf();
}

interface I1{
    void icf1();
}

class test1 implements I,I1
{

    @Override
    public void icf() {
        System.out.println("ineteface test");
    }

    @Override
    public void icf1() {
        System.out.println("ineteface test with second interface");
    }

    void interfaceCollection()
    {
        icf();
        icf1();
    }
}
