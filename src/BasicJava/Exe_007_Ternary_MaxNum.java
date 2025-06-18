package BasicJava;

public class Exe_007_Ternary_MaxNum {
    public static void main(String[] args) {

        int a=102;
        int b=202;
        int c=30;

        int result = a>b?(a>c?a:c):(b>c?b:c);
        System.out.println(result);
    }
}
