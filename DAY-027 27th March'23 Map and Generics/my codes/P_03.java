/*
hashmap -------
1. duplicate key not allowed
2. null entry allowed
3. every key and value pair is an entry
4. order of insertion not reserved
*/

/*
LinedHashMap ------
1. same as hashmap but order of insertion reserved
*/

import java.util.HashMap;
import java.util.LinkedHashMap;

public class P_03 {
    public static void main(String[] args) {
        HashMap hm1 = new HashMap();
        hm1.put(01, "Rahul");
        hm1.put(02, "Tanushree");
        hm1.put(03, "Ratashree");
        hm1.put(null, null);

        System.out.println(hm1);


        LinkedHashMap lhm1 = new LinkedHashMap();
        lhm1.put(01, "Rahul");
        lhm1.put(02, "Tanushree");
        lhm1.put(03, "Ratashree");
        lhm1.put(null, null);

        System.out.println(lhm1);
    }
}
