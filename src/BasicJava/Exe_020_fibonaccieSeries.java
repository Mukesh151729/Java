package BasicJava;

public class Exe_020_fibonaccieSeries {
    public static void main(String[] args) {

        int a=0;
        int b=1;

        System.out.print("Fibonaccie Series--"+a+" "+b);

        int count=10;
        for (int i = 0; i <count ; i++) {
            int next=a+b;
            System.out.print("," + next);
            a = b;
            b = next;
        }
    }
}
