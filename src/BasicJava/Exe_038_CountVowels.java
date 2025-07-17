package BasicJava;

public class Exe_038_CountVowels {
    public static void main(String[] args) {

        String str="Mukesh Vijay Dhage";
        int vCount=0;
        int cCount=0;
        for (int i = 0; i <str.length() ; i++) {
            //System.out.print(str.charAt(i));
                char ch= Character.toLowerCase(str.charAt(i));
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                vCount++;
            }
            else if (ch>='a'&& ch<='z'){

                cCount++;
            }

        }
        System.out.print(vCount);
        System.out.print(cCount);
}
}
