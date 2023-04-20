
/*
arraydeque
1. duplicates allowed
2. index based insertion or deletion not allowed
3. mixed type data allowed
*/


import java.util.ArrayDeque;

public class P_01 {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();

        ad.add(100);
        System.out.println("ad.add(100) : " + ad);

        ad.addFirst(10);
        System.out.println("ad.addFirst(10) : " + ad);

        ad.addLast(25);
        System.out.println("ad.addLast(25) : " + ad);

        ad.offer(10); // not sure of adding element
        System.out.println("ad.offer(10) : " + ad);

        ad.offerFirst(20); // not sure of adding element
        System.out.println("ad.offerFirst(20) : " + ad);

        ad.offerLast(30); // not sure of adding element
        System.out.println("ad.offerLast(30) : " + ad);

    }
}
