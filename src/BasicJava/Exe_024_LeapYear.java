package BasicJava;

import java.util.Scanner;

public class Exe_024_LeapYear {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int year=2024;
        System.out.println("Enter year--");

        if(sc.hasNextInt()) {
             year = sc.nextInt();

        }
        else {
            System.out.println("Enter valid year");
            System.exit(0);
        }
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
            System.out.println(year+" Is leap yeat");
        }
        else {
            System.out.println(year+" is not leap year");
        }
    }
}
