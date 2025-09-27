package BasicJava;

public class Exe_059_PrintArrayReverse {
    public static void main(String[] args) {
         int arr[]={1,4,6,3};
         int left=0;
         int right=arr.length-1;

         for (int i=arr.length-1;i>=0;i--)
         {
             System.out.print(arr[i]+" ");
         }

         while (right==0)
         {
             int temp=right;
             right=left;
             left=temp;
             left++;
             right--;
         }

        System.out.println(" ");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
