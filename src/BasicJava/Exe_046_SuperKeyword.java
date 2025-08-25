package BasicJava;

public class Exe_046_SuperKeyword {
    public static void main(String[] args) {

        SON s=new SON();
        s.t();
    }
}

class PARENTS{
     int gold=100;

    public PARENTS() {
        System.out.println("Father DC");
    }

    void home()
     {
         System.out.println("Father home");
     }
}

class SON extends PARENTS{
    public SON() {
        super();
    }

    void t()
    {
        super.home();
        System.out.println(super.gold);
    }
}
