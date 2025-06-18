package BasicJava;

public class Exe_004_TypeCasting {

    public static void main(String[] args) {

        int course=10;
        float GST=18.45f;

       // int total= course+GST;  // not possible

       int total= course+(int) GST;

        System.out.println(total);
       float total1=course+GST;
        System.out.println(total1);


    }
}
