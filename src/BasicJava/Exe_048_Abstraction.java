package BasicJava;

public class Exe_048_Abstraction {
}

abstract class Engine{

    abstract void StaartEngine();
    abstract void StopEngine();
}

class WagnoR extends Engine
{

    @Override
    void StaartEngine() {
        System.out.println("Start Engine");
    }

    @Override
    void StopEngine() {
        System.out.println("Stop Engine");
    }


}
