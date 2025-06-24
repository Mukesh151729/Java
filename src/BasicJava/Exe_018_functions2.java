package BasicJava;

import java.util.Scanner;

public class Exe_018_functions2 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int a=0,b=0;
        System.out.println("Enter value of a");
        if(sc.hasNextInt()) {
             a = sc.nextInt();
        }else {
            System.out.println("Please enter only integer value");
            System.exit(0);
        }

        System.out.println("Enter value of b");

        if(sc.hasNextInt()) {
            b = sc.nextInt();
        }else {
            System.out.println("Please enter only integer value");
            System.exit(0);
        }

        int add_result=add(a,b);
        int sub_result=sub(a,b);
        int div_result=div(a,b);
        int mul_result =mul(a,b);

        System.out.println(add_result);
        System.out.println(sub_result);
        System.out.println(div_result);
        System.out.println(mul_result);

    }

    public static int add(int a,int b)
    {
        return a+b;
    }

    public static int sub(int a,int b)
    {
        return a-b;
    }

    public static int mul(int a,int b)
    {
        return a*b;
    }

    public static int div(int a,int b)
    {
        if(b==0)
        {
            System.out.println("Division by zero not allowed");
        }
        return a/b;
    }
}
