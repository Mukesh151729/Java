package BasicJava;

public class Exe_050_MultipleInheritance {
    public static void main(String[] args) {

        child1 child1 = new child1();
        child1.allFunctions();
    }
}

interface mother1
{
    void money();
    void m1();
}

interface father1
{
    void money();
    void f1();
}

class child1 implements mother1,father1
{

    @Override
    public void f1() {
        System.out.println("Father function");
    }

    @Override
    public void money() {
        System.out.println("Take money");
    }

    @Override
    public void m1() {
        System.out.println("Mother function");
    }

    void allFunctions()
    {
        money();
        m1();
        f1();
    }
}
