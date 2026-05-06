package BasicJava;

public class Exe_061_productArray {
    public static void main(String[] args) {

        int a[]={1,4,6,7,9};
        int product=1;

        for (int i = 0; i <a.length ; i++) {
            product=product*a[i];
        }

        System.out.println(product);
    }
}
