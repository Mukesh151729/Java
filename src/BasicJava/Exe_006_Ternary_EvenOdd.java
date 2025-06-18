package BasicJava;

public class Exe_006_Ternary_EvenOdd {
    public static void main(String[] args) {

        int num= 4;
        int result = num%2;

        String even= (result==0)?"number is even":"number is odd";

        System.out.println(even);
    }
}
