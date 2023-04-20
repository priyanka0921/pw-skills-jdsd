/*
Hashtable -----
1. duplicate key not allowed
2. null value not allowed
*/
/*

TreeMap ----
1. ascending sorted order
2.
*/

import java.util.Hashtable;
import java.util.TreeMap;

public class P_06 {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(1, "Rahul-1");
        ht.put(2, "Rahul-2");
        ht.put(3, "Rahul-3");

        System.out.println(ht);

        TreeMap tm = new TreeMap();
        tm.put(2, "Rahul");
        tm.put(1, "Ramesh");
        tm.put(4, "Hello");
        tm.put(3, "Ravi");

        System.out.println(tm);
    }

}
