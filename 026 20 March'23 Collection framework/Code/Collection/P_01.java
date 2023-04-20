import java.util.ArrayList;

public class P_01 {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<Integer>();

        al1.add(100);
        al1.add(200);
        al1.add(300);

        System.out.println(al1);

        ArrayList al2 = new ArrayList<>();
        al2.add("Pw skills");
        al2.add("Rahul");
        al2.add(2);
        al2.add('j');
        al2.add(1.1);

        System.out.println(al2);

        ArrayList al3 = new ArrayList<>();
        al3.add(1);
        al3.add(2);
        al3.add(3);
        System.out.println(al3);
        al3.addAll(al2);
        System.out.println(al3);

        al3.add(2, "Rahul Dutta");
        System.out.println(al3);

    }
}
