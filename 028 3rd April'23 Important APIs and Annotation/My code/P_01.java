import java.util.Date;

public class P_01 {
    public static void main(String[] args) {
        Date d1 = new Date();
        long timeInMs = d1.getTime();
        System.out.println(d1);

        Date d2 = new java.sql.Date(timeInMs);
        System.out.println(d2);

    }
}
