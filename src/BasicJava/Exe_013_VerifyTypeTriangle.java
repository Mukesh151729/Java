package BasicJava;

import java.util.Scanner;

public class Exe_013_VerifyTypeTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side 1");
        int side1= sc.nextInt();

        System.out.println("Enter side 2");
        int side2= sc.nextInt();

        System.out.println("Enter side 3");
        int side3= sc.nextInt();

        if(side1<=0 || side2<=0 || side3<=0)
        {
            System.out.println("Enter proper side");
        }
        else {
            if (side1==side2 && side2==side3 && side1==side3)
            {
                System.out.println("Traingle is equvilatral");
            } else if (side1==side2 || side2==side3 || side1==side3) {
                System.out.println("Traingle is equivallanc");
            } else  {
                System.out.println("Sides are not equal");

            }
        }
    }
}
