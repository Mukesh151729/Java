package BasicJava;

public class Exe_039_FrequencyOfElement {
    public static void main(String[] args) {
        int a[]={1,1,2,3,4,5,1};
        boolean visited[]=new boolean[a.length];

        for (int i = 0; i <a.length ; i++) {
            if (visited[i])
            {continue;
            }
            int count=1;
            for (int j = i+1; j <a.length ; j++) {
                if (a[i] == a[j]) {
                    count++;
                    visited[j]=true;
                }

            }
            System.out.println("Count of "+a[i] +" is "+ count);
        }
    }
}
