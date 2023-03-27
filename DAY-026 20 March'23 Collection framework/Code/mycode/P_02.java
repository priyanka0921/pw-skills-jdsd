/*
priority queue
1. index based accessing not allowed
2. don't follow insertion order
3. Min-heap data structure
4. duplicate allowed
5. mixed type data not allowed
*/


import java.util.PriorityQueue;

public class P_02 {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        pq.add(100);
        pq.add(50);
        System.out.println("pq.add : " + pq);

    }
}
