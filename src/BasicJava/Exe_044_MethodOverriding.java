package BasicJava;

public class Exe_044_MethodOverriding {
    public static void main(String[] args) {
            SONS s=new SONS();
            s.home();

            parents p=new parents();
            p.home();

            parents p1=new SONS();
            p1.home();
    }
}

class parents{

    void home()
    {
        System.out.println("2BHK from parent");
    }
}

class SONS extends parents{

    void home()
    {
        System.out.println("3BHK from sons");
    }
}
