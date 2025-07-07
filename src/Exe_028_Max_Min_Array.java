import java.util.Scanner;

public class Exe_028_Max_Min_Array {
    public static void main(String[] args) {
      //  int a[] = {14, 4, 6, -30};


        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of array--");
        int size=sc.nextInt();
        int a[] = new int[size];

        for (int i = 0; i <size ; i++) {

            System.out.println("Enter the number");
            a[i]=sc.nextInt();

        }

        for (int i = 0; i <a.length ; i++) {

            System.out.println(a[i]);


        }

        int max_value=give_max(a);
        System.out.println(max_value);


}
    public static int give_max(int a[])
    {
        int max = a[0];

        for (int i = 0; i <a.length; i++) {
            if (max<a[i])
            {
                max=a[i];
            }

        }
        return max;
    }
}
