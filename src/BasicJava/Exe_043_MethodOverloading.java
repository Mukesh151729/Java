package BasicJava;

public class Exe_043_MethodOverloading {
    public static void main(String[] args) {

        maths m=new maths();

        int r=m.add(1,2);
        System.out.println(r);

        int r1=m.add(1,2,3);
        System.out.println(r1);

    }
}

class maths{

    int add(int a,int b)
    {return a+b;}

    int add(int a,int b,int c)
    {
        return a+b+c;
    }
}
