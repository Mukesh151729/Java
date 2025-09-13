package BasicJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Exe_054_UserInput_ArrayList {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String continuInput = "Y";

        ArrayList<String> names=new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        while (continuInput.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter Your name");
            String name=sc.nextLine();
            names.add(name);

            System.out.println("Enter age");
            Integer age=sc.nextInt();
            ages.add(age);

            sc.nextLine();
            System.out.println("Do you want to continue (Y/N)");
            continuInput=sc.nextLine();
        }

        for (Object o1:names )
        {
            System.out.println(o1);
        }

        for (Object o2:ages)
        {
            System.out.println(o2);
        }



    }
}
