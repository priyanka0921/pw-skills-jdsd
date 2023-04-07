
import java.time.*;
public class P_02 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getMonth());
        LocalTime time = LocalTime.now();
        System.out.println(time);



    }
}
