package BasicJava;

public class Exe_023_PalindromeSeries {
    public static void main(String[] args) {

        String name="rmadam";
        System.out.println(name.length());
        String reverse=reverseNum(name);

        if (name.equalsIgnoreCase(reverse))
        {
            System.out.println(name+" is palindrom");
        }
        else {
            System.out.println(name+" is not palindrom");
        }


    }

    public static String reverseNum(String name)
    {
        String reverse="";

        for (int i =name.length()-1 ; i >=0 ; i--) {

            reverse=reverse+name.charAt(i);
        }
        //System.out.println(reverse);
        return reverse;

    }
}
