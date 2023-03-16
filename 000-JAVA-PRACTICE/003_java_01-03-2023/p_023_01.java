class c1 {
    int age = 18;
}

class c2 extends c1 {
    int age = 20;
}

public class p_023_01 {
    public static void main(String[] args) {
        c1 e = new c1(); // one object of c1 class is being created
        c2 e1 = new c2(); // one object of c2 class is being created
        c1 e2 = new c2(); // one onject of c1 class is being created


        System.out.println(e.age); // 18
        System.out.println(e1.age); // 20
        System.out.println(e2.age); // 18

        // what will be the output ??
    }
}
