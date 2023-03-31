import java.util.*;

public class P_04 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, "Rohan");
        map.put(2, "Vhirat");
        map.put(3, "Rahul");
        map.put(4, "rohit");

        System.out.println(map);

        System.out.println(map.get(1)); // Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.

        System.out.println("-------------------");

        Set keySet = map.keySet();
        Iterator itr1 = keySet.iterator();
        while(itr1.hasNext()){
//            System.out.println(itr1.next());
            Integer no = (Integer) itr1.next();
            System.out.println(no);
        }

        System.out.println("-------------------");

        Collection values = map.values();

        Iterator itr2 = values.iterator();
        while(itr2.hasNext()){
//            System.out.println(itr2.next());
            String name = (String) itr2.next();
            System.out.println(name);
        }


        System.out.println("-------------------");

        Set entrySet = map.entrySet();
        Iterator itr3 = entrySet.iterator();
        while(itr3.hasNext()){
//            System.out.println(itr3.next());
            Map.Entry data = (Map.Entry) itr3.next();
            System.out.println(data.getKey()+" : "+data.getValue());
        }

    }
}
