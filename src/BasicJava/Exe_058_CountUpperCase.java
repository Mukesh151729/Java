package BasicJava;

public class Exe_058_CountUpperCase {
    public static void main(String[] args) {

        String str="Mukesh DhAge";
        int count=0;


        for (char c:str.toCharArray())
        {
            if(Character.isUpperCase(c))
            {
                count++;
                System.out.println(c+" ");
            }
        }


        System.out.println("Total uppercase count is -- "+count);
    }
}
