package BasicJava;

import java.util.Scanner;

public class Exe_019_ReverseNum {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number");
        int Number =sc.nextInt();
        reverseNum(Number);
    }

    public static void reverseNum(int number)
    {
        int reversed=0;
        while (number!=0)
        {
            int digit = number%10;
            reversed=reversed*10+digit;
            number=number/10;
        }
        System.out.println("Reversed number is--"+reversed);
    }
}
