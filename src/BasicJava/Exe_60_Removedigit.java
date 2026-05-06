package BasicJava;

import java.util.Locale;

public class Exe_60_Removedigit {
    public static void main(String[] args) {

        String str="Muk34esh Dhag98E";
        String small=str.toLowerCase();
        String newStr = "";


        for (int i = 0; i <small.length() ; i++) {

            char c=small.charAt(i);
            if (c>='0' && c<='9')
            {
                continue;
            }
            else {
                newStr=newStr+c;
            }
        }

        System.out.println(newStr);
    }
}
