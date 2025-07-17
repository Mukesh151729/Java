package BasicJava;

public class Exe_037_ReverseString {
    public static void main(String[] args) {

        String para= "Mukesh Vijay Dhage";
        String arr[]=para.split(" ");
        String reverse=" ";

        for (int i =0; i <arr.length ; i++) {

            String word= arr[i];

            for (int j = word.length()-1; j >=0 ; j--) {
                reverse=reverse+word.charAt(j);
            }
            reverse=reverse+" ";
        }
        System.out.print(reverse.trim());
        System.out.println();

        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }

    }
}
