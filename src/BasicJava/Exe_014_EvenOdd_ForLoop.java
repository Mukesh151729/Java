package BasicJava;

public class Exe_014_EvenOdd_ForLoop {
    public static void main(String[] args) {

        for (int i = 0; i <=50; i++) {
            if (i%2==0)
            {
                System.out.println("Even--"+i);
            }
            else {
                System.out.println("Odd--"+i);
            }

        }
    }
}
