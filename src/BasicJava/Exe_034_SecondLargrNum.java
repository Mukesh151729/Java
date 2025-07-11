package BasicJava;

import java.util.Arrays;

public class Exe_034_SecondLargrNum {
    public static void main(String[] args) {

        int [] a={3,7,9,90,87,77,45};


        Arrays.sort(a);

        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
        System.out.println(a[a.length-2]);// second largest
        System.out.println(a[1]);// second minimum
    }
}
