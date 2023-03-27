import java.util.LinkedList;

public class P_02{
    public static void main(String[] args) {

        LinkedList ll1 = new LinkedList();

        ll1.add(100);
        ll1.add(200);
        ll1.add(300);

        System.out.println(ll1);

        LinkedList ll2 = new LinkedList<>();
        ll2.add("Pw skills");
        ll2.add(1);
        ll2.add('a');
        System.out.println(ll2);

        LinkedList ll3 = new LinkedList<>();
        ll3.add(10);
        ll3.add(20);
        ll3.add(30);

        ll3.addFirst("PW");
        ll3.addLast("100");

        System.out.println(ll3);

        ll3.add(2, 50);

        System.out.println(ll3);

        System.out.println(ll3.peek()); // to return the first object in linkedlist

        System.out.println(ll3);

        System.out.println(ll3.poll()); // to return the first object in linkedlist and remove it form the linked list

        System.out.println(ll3);

        


    }
}