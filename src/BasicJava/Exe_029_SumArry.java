package BasicJava;

public class Exe_029_SumArry {
    public static void main(String[] args) {

        int a[]={1,3,5,6};

        int sum=0;
        for (int i = 0; i <a.length ; i++) {

            sum =sum+a[i];
        }
        System.out.println(sum);
    }
}
