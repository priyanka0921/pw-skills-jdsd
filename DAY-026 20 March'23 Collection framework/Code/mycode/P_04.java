
/*
hashset
1. duplicate value not allowed
2. used hashtable in the backend
3. best used for searching operation
4. lower factor 75%
*/


/*
Linked HashSet
1. retain the oder of insertion
2. it's parent class is Hashset
*/


import java.util.HashSet;
import java.util.LinkedHashSet;

public class P_04 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(100);
        hs.add(20);
        hs.add(30);
        hs.add(40);

        System.out.println(hs);

        LinkedHashSet lhs = new LinkedHashSet();

        lhs.add(100);
        lhs.add(20);
        lhs.add(30);


    }
}
