package BasicJava;

import java.util.Scanner;

public class Exe_012_ifelse {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter marks");
        int marks=sc.nextInt();
        char grade='F';

        if(marks>=90 && marks<=100)
        {
            grade='A';
        } else if (marks>=80 && marks<=89) {
            grade='B';

        } else if (marks>=70 && marks<=79) {
            grade='C';

        } else if (marks>=60 && marks<=69) {
            grade='D';
        } else if (marks<=59 && marks>0) {
            grade='F';
        } else if (marks<=0 || marks>100) {
            grade='O';
            System.out.println("Please enter valid marks");
        }
        System.out.println("Your grade is--"+grade);
    }
}
