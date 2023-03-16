class c1 {
    c1() {
        System.out.println("This is c1 constructor.");
    }

    public void c1m1() {
        System.out.println("This is m1 inside c1.");
    }
}

class c2 extends c1 {
    c2() {
        super();
        System.out.println("This is c2 constructor.");
    }

    public void c2m1() {
        System.out.println("This is m1 inside c2.");
    }
}

public class p_023_02 {
    public static void main(String[] args) {
        c1 e1 = new c1(); // c1 er object 
        System.out.println();//----------
        c2 e2 = new c2();// c2 er object
        System.out.println();//----------
        c1 e3 = new c2(); // 
        System.out.println();//----------
        e1.c1m1();
        System.out.println();//----------
        e2.c1m1();
        System.out.println();//----------
        e2.c2m1();
        System.out.println();//----------
        e3.c1m1();


        
        // Can constructor be inherit ?? -->> No
        // What will be the output ?? -->> 
        // Can we call the c2m1 method for e3 object ??


        // This is c1 constructor.

        // This is c2 constructor.

        // This is c2 constructor.

        // This is m1 inside c1.

        // This is m1 inside c1.

        // This is m1 inside c2.

        // This is m1 inside c1.

    }
}
