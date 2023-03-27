import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class P_05 {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add(100);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        System.out.println(a1);

        System.out.println("For loop ----------");

        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i));
        }

        System.out.println("For each loop ----------");

        for (Object o : a1 ) {
            System.out.println(o);
        }

        System.out.println("Iterator -----------");

        Iterator itr = a1.iterator();

        while (itr.hasNext()){
            Integer i = (Integer)itr.next();
            System.out.println(i);
        }

        System.out.println("List Iterator ----------");

        ListIterator litr = a1.listIterator(a1.size());

        while (litr.hasPrevious()){
            System.out.println(litr.previous());
        }


    }
}
