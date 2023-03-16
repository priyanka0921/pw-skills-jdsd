
public class IncrementDrecrement{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        // post increment 
        System.out.println("[ a++ ] : "+(a++)); // 10
        System.out.println("[  a  ] : "+(a));   // 11

        // pre increment 
        System.out.println("[ ++b ] : "+(++b)); // 21
        System.out.println("[  b  ] : "+(b));   // 21

        // post decrement 
        System.out.println("[ c-- ] : "+(c--)); // 30
        System.out.println("[  c  ] : "+(c));   // 29

        // pre decrement 
        System.out.println("[ --d ] : "+(--d)); // 39
        System.out.println("[  d  ] : "+(d));   // 39

    }
}

