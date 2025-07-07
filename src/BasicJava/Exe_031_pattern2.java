package BasicJava;

public class Exe_031_pattern2 {
    public static void main(String[] args) {

        int num=15;

        for (int i = 0; i <5 ; i++) {
            for (int j = 5; j >i ; j--) {
                System.out.print(num+" ");
                num--;
            }
            System.out.println(" ");
        }
    }
}
