package BasicJava;

public class Exe_040_LeaderNumberInArray {
    public static void main(String[] args) {
// Leader number means number is greater than all the number to it's right in the array
        int a[]={16,17,4,3,5,2};
        int length=a.length;

        System.out.println(length);
        int maxRight=a[length-1];
        System.out.println(maxRight);

        for (int i = length-2; i >=0 ; i--) {
            if (a[i] > maxRight) {
                maxRight=a[i];
                System.out.println(maxRight);
            }
        }
    }
}
