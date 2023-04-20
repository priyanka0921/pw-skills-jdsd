
/*
Tree Set
1. Can't preserve order of insertion
2. sorted order
3. follow binary search tree in backend (***)
4. out put can be determined using lvr technique (***)
5. duplicate note allowed (***)
*/


import java.util.TreeSet;

public class P_03 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(40);
        System.out.println(ts);

        System.out.println(ts.higher(50));
        System.out.println(ts.lower(50));
        System.out.println(ts.ceiling(55));
        System.out.println(ts.floor(45));

    }
}
