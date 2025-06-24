package BasicJava;

import java.util.Scanner;

public class Exe_017_functions {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter f name");
        String fname=sc.nextLine();

        System.out.println("Enter l name");
        String lname=sc.nextLine();

        System.out.println("Enter salary name");
        int salary=sc.nextInt();

        employeeDetails(fname,lname,salary);
        employeeDetails("Mukesh","Dhage",500000);

        System.out.println("Enter first number");
        int a= sc.nextInt();

        System.out.println("Enter second number");
        int b= sc.nextInt();

       int add= add(10,20);
        System.out.println(add);

        int sum=add(a,b);
        System.out.println(sum);
    }

    // with parameter without return type
    public static void employeeDetails(String fname,String lname,int salary)
    {
        System.out.println("Name is--"+fname+"Last Name--"+lname+"Salary--"+salary);
    }

    //with parameter with return type

    public static int add(int a,int b)
    {
        return a+b;
    }
}
