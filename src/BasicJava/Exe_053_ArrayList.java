package BasicJava;

import java.util.ArrayList;
import java.util.List;

public class Exe_053_ArrayList {
    public static void main(String[] args) {

        ArrayList arrayList=new ArrayList();
        arrayList.add("Mukesh");
        arrayList.add("Dhage");
        arrayList.add(989893);

        System.out.println(arrayList);
        System.out.println(arrayList.size());

        List l= new ArrayList();
        l.add("Mone");
        l.add(989829);

        System.out.println(l);
        System.out.println(l.size());
    }

}
